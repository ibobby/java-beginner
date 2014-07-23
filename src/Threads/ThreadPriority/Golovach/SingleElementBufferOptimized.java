package Threads.ThreadPriority.Golovach;

/**
 * Created by WhiteMountiens on 23.07.2014.
 */
public class SingleElementBufferOptimized {

    private int waitedProducers = 0;
    private int waitedCustomers = 0;
    private Integer elem = null;

    public synchronized void put(Integer newElem) throws InterruptedException {
        while (newElem != null) {
            waitedProducers++;
            this.wait();
            waitedProducers--;
        }
    }

    public synchronized int get() throws InterruptedException {
        while (elem == null) {
            waitedCustomers++;
            this.wait();
            waitedCustomers--;
        }

        int result = this.elem;
        this.elem = null;
        if (waitedProducers > 0) {
            this.notify();
        }
        return result;
    }

}
