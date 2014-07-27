package Threads.ThreadPriority.Golovach.Interrupt;

/**
 * Created by WhiteMountiens on 27.07.2014.
 */
public class InterruptedConsumer implements Runnable {

    private InterruptBuffer buffer;

    public InterruptedConsumer(InterruptBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            int elem = buffer.get();
            System.out.println(elem + " consumed");
        }
    }
}
