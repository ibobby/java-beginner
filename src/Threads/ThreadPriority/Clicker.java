package Threads.ThreadPriority;

public class Clicker implements Runnable {

    private  volatile boolean running = true;
    long clicks;
    Thread t;


    Clicker(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    @Override
    public void run() {
        while (running) {
            clicks++;
        }
    }

    public void start() {
        t.start();
    }

    public void stop() {
        running = false;
    }
}
