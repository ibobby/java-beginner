package Threads.ThreadPriority.Golovach.DifferentBuffers;

/**
 * Created by bobby on 23.07.2014.
 */
public class SingleElementBufferOptimizedB {

    private Integer elem;

    public synchronized void put(Integer newElem) throws InterruptedException {
        while (elem != null) {
            this.wait();
            if (elem != null) {
                this.notify();
            }
        }

        this.elem = newElem;
        this.notify();

    }

    public synchronized Integer get() throws InterruptedException {
        while (elem == null) {
            this.wait();
            if (elem == null) {
                this.notify();
            }
        }
        int result = elem;
        elem = null;
        this.notify();
        return result;
    }

}
