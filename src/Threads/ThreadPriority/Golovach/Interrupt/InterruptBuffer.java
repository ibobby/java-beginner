package Threads.ThreadPriority.Golovach.Interrupt;

/**
 * Created by WhiteMountiens on 27.07.2014.
 */
public class InterruptBuffer {

    private ThreadNode producers;
    private ThreadNode consumers;
    private Integer elem;

    public synchronized void put(Integer newElem) {
        while (elem != null) {
            try {
                this.wait();
            } catch (InterruptedException e) {/*NOP*/}
        }

        elem = newElem;

        if (consumers != null) {
            consumers.thread.interrupt();
        }
    }

    public synchronized Integer get() {
        while (elem == null) {
            try {
                this.wait();
            } catch (InterruptedException e) {/*NOP*/}
        }

        int result = elem;
        elem = null;

        if (producers != null) {
            producers.thread.interrupt();
        }

        return result;
    }

}
