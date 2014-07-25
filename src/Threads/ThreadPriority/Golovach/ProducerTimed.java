package Threads.ThreadPriority.Golovach;

import java.util.concurrent.TimeoutException;

/**
 * Created by bobby on 25.07.2014.
 */
public class ProducerTimed implements Runnable {

    private int startValue;
    private final int period;
    private final SingleElementBufferTimed buffer;
    private final long timeout;

    public ProducerTimed(int period, SingleElementBufferTimed buffer, long timeout, int startValue) {
        this.period = period;
        this.buffer = buffer;
        this.timeout = timeout;
        this.startValue = startValue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(startValue + " value produced");
                buffer.put(startValue++, timeout);
                Thread.sleep(period);
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
