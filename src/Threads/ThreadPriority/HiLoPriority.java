package Threads.ThreadPriority;

public class HiLoPriority {

    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);

        hi.start();
        lo.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("main thread stopped");
        }

        hi.stop();
        lo.stop();

        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("catch interrupted exception");
        }

        System.out.println("high: " + hi.clicks);
        System.out.println("low:  " + lo.clicks);
    }

}
