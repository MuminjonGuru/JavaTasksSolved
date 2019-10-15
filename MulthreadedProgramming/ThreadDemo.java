import sun.rmi.runtime.NewThreadAction;

class NewThread implements Runnable {

    Thread t;

    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "demo thread");
        System.out.println("Child thread: " + t);
    }

    // This is the entry point for the second thread
    public void run() {
        try {
            for(int x = 5; x > 0; x--) {
                System.out.println("Child Thread: " + x);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread.");
    }

}

class ThreadDemo {
    public static void main(String args[]) {
        NewThread nt = new NewThread();

        nt.t.start();  // Start the thread

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
