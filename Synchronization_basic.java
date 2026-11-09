// Without synchronization, the output of this program is unpredictable. 
// The expected output is 2000000, but due to race conditions, the actual output may be less than that. 
// This is because both threads are incrementing the same counter variable concurrently without any synchronization mechanism in place.
/*class Counter {

    int count = 0;

    void increment() {
        count++;
    }
}

public class Synchronization_basic {

    public static void main(String[] args)
            throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected: 2000000");
        System.out.println("Actual: " + c.count);
    }
}*/

// With Synchronization, the output of this program will always be 2000000.
class Counter {

    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class Synchronization_basic {

    public static void main(String[] args)
            throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Expected: 2000000");
        System.out.println("Actual: " + c.count);
    }
}