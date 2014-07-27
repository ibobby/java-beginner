package Threads.ThreadPriority.Golovach.DifferentBuffers;

/**
 * Created by bobby on 25.07.2014.
 */
public class MainTimed {

    public static void main(String[] args) {

        SingleElementBufferTimed buffer = new SingleElementBufferTimed();

        Thread producer1 = new Thread(new ProducerTimed(1500, buffer, 100, 1), "producer");
        //Thread producer2 = new Thread(new ProducerTimed(1000, buffer, 100, 1), "producer");
        Thread customer1 = new Thread(new ConsumerTimed(buffer, 1000), "consumer");
        producer1.start();
        //producer2.start();
        customer1.start();


    }

}
