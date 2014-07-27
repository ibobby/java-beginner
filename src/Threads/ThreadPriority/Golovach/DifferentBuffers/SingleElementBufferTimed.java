package Threads.ThreadPriority.Golovach.DifferentBuffers;

import java.util.concurrent.TimeoutException;

/**
 * Created by bobby on 23.07.2014.
 */
public class SingleElementBufferTimed {

    private Integer elem;

    public synchronized void put(Integer newElem, long timeout) throws InterruptedException, TimeoutException {
        long waitTime = timeout;
        while (elem != null && waitTime > 0) {
            long t0 = System.currentTimeMillis();
            wait(waitTime);
            long t1 = System.currentTimeMillis();
            long elapsedTime = t1 - t0;
            waitTime -= elapsedTime;
        }

        if (waitTime < 0) {
            throw new TimeoutException();
        }

        this.elem = newElem;
        this.notifyAll();
    }

    public synchronized Integer get(long timeout) throws InterruptedException, TimeoutException {
        long waitTime = timeout;
        while (elem == null && waitTime > 0) {
            long t0 = System.currentTimeMillis();
            wait();
            long t1 = System.currentTimeMillis();
            long elapsedTime = t1 - t0;
            waitTime -= elapsedTime;
        }

        System.out.println("waitTime = " + waitTime + "timeout = " + timeout);

        if (waitTime < 0) {
            throw new TimeoutException();
        }

        Integer result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }

}
