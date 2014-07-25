package Threads.ThreadPriority.Golovach;

/**
 * Created by WhiteMountiens on 23.07.2014.
 */
public class SingleElementBufferOptimized {

    private int waitedProducers = 0;
    private int waitedCustomers = 0;
    private Integer elem = null;

    public synchronized void put(Integer newElem) throws InterruptedException {
        while (elem != null) {
            waitedProducers++;
            System.out.println("Producer: waitedProducers = " + waitedProducers + " elem = " + elem + " waitedCustomers = " + waitedCustomers);
            this.wait();
            waitedProducers--;
            System.out.println("Producer: waitedProducers = " + waitedProducers + " elem = " + elem + " waitedCustomers = " + waitedCustomers);
        }
        elem = newElem;
        //System.out.println("produced " + elem + " waitedProducers = " + waitedProducers);
        System.out.println("Producer alive");
        if (waitedCustomers > 0) {
            this.notify();
        }
    }

    public synchronized int get() throws InterruptedException {
        while (elem == null) {
            waitedCustomers++;
            System.out.println("Customer: waitedProducers = " + waitedProducers + " elem = " + elem + " waitedCustomers = " + waitedCustomers);
            this.wait();
            waitedCustomers--;
            System.out.println("Customer: waitedProducers = " + waitedProducers + " elem = " + elem + " waitedCustomers = " + waitedCustomers);
        }

        int result = this.elem;
        this.elem = null;
        //System.out.println("consumed " + result + " waitedCustomers = " + waitedCustomers);
        System.out.println("Customer alive");
        if (waitedProducers > 0) {
            this.notify();
        }
        return result;
    }

}
