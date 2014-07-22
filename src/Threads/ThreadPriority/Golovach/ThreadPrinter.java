package Threads.ThreadPriority.Golovach;

/**
 * Created by bobby on 22.07.2014.
 */
public class ThreadPrinter implements Runnable {

    private String message;
    private long sleepTime;

    public ThreadPrinter(String message, long sleepTime) {
        this.message = message;
        this.sleepTime = sleepTime;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }

            System.out.println(message);
        }
    }
}
