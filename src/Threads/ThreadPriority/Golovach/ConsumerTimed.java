package Threads.ThreadPriority.Golovach;

import java.util.concurrent.TimeoutException;

/**
 * Created by bobby on 25.07.2014.
 */
public class ConsumerTimed implements Runnable {

    private final SingleElementBufferTimed buffer;
    private final long timeout;

    public ConsumerTimed(SingleElementBufferTimed buffer, long timeout) {
        this.buffer = buffer;
        this.timeout = timeout;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int elem = buffer.get(timeout);
                System.out.println(elem + " consumed");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " stopped");
                return;
            } catch (TimeoutException e) {
                System.out.println(Thread.currentThread().getName() + " time out");
                return;
            }
        }
    }
}
