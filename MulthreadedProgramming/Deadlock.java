// An example of deadlock
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " entered A.foo");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A interrupted");
        }

        System.out.println(name + " trying to call B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside A.last");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B Interrupted");
        }

        System.out.println(name + " trying to call A.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("Inside A.last");
    }
}


class Deadlock implements Runnable {

    //  A special type of error that you need to avoid that relates specifically to multitasking is deadlock,
    // which occurs when two threads have a circular dependency on a pair of synchronized objects.

    A a = new A();
    B b = new B();
    Thread t;

    Deadlock() {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this, "RacingThread");
    }

    void deadlockStart() {
        t.start();
        a.foo(b);  // get lock on a in this thread
        System.out.println("Back in main thread");
    }

    @Override
    public void run() {
        b.bar(a);  // get lock on b in this thread
        System.out.println("Back in other thread");
    }

    public static void main(String args[]) {
        Deadlock dl = new Deadlock();
        dl.deadlockStart();
    }
}
