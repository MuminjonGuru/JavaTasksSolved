import java.lang.Thread;

// Create a second thread by extending Thread
class NewThread extends Thread {
    NewThread() {
        //  Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
    }

    // this is the entry point for the second thread
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread.");
    }

}

public class ExtendingThread {

    public static void main(String args[]) {
        NewThread nt = new NewThread();  // create a new thread
        nt.start();  // start the thread

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

/*
Child thread: Thread[Demo Thread,5,main]
Main Thread: 5
Child Thread: 5
Child Thread: 4
Main Thread: 4
Child Thread: 3
Child Thread: 2
Main Thread: 3
Child Thread: 1
Exiting child thread.
Main Thread: 2
Main Thread: 1
Main thread exiting.
 */
