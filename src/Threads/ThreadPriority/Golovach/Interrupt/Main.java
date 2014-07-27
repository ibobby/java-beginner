package Threads.ThreadPriority.Golovach.Interrupt;

/**
 * Created by WhiteMountiens on 27.07.2014.
 */
public class Main {

    public static void main(String[] args) {

        InterruptBuffer buffer = new InterruptBuffer();

        Thread[] produsers = new Thread[]{
                new Thread(new InterruptedProducer(1, buffer)),
                new Thread(new InterruptedProducer(100, buffer)),
                new Thread(new InterruptedProducer(1000, buffer))
        };

        for (Thread producer : produsers) {
            producer.start();
        }

        Thread[] consumers = new Thread[]{
                new Thread(new InterruptedConsumer(buffer)),
                new Thread(new InterruptedConsumer(buffer))
        };

        for (Thread consumer : consumers) {
            consumer.start();
        }

    }
}
