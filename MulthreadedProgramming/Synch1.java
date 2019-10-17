// This program uses a synchronized block
class CallMe {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interruped");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller(CallMe targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    // synchronize calls to call()
    public void run() {
        synchronized (target) {  // synchronized block
            target.call(msg);
        }
    }
}

public class Synch1 {
    public static void main(String args[]) {
        CallMe target = new CallMe();
        Caller obj1 = new Caller(target, "Hello");
        Caller obj2 = new Caller(target, "Synchronized");
        Caller obj3 = new Caller(target, "Hello");

        // Start the threads
        obj1.t.start();
        obj2.t.start();
        obj3.t.start();

        // wait for threads to end
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
