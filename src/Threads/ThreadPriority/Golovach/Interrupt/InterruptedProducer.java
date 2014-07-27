package Threads.ThreadPriority.Golovach.Interrupt;

import java.util.Random;

/**
 * Created by WhiteMountiens on 27.07.2014.
 */
public class InterruptedProducer implements Runnable {

    private Integer startValue;
    private  InterruptBuffer buffer;

    public InterruptedProducer(Integer startValue, InterruptBuffer buffer) {
        this.startValue = startValue;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(startValue + " produced");
                buffer.put(startValue++);
                Thread.sleep((int) (1000 * Math.random()));
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
