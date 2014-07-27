package Threads.ThreadPriority.Golovach.DifferentBuffers;

/**
 * Created by bobby on 23.07.2014.
 */
public class SingleElementBufferOptimizedMainB {

    public static void main(String[] args) {

        SingleElementBufferOptimizedB buffer = new SingleElementBufferOptimizedB();

        Thread producer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        buffer.put(i);
                    } catch (InterruptedException ignore) {}
                }
            }
        });

        Thread producer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        buffer.put(i);
                    } catch (InterruptedException ignore) {}
                }
            }
        });

        Thread customer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        buffer.get();
                    } catch (InterruptedException ignore) {}
                }
            }
        });

        producer1.start();
        //producer2.start();
        customer.start();

    }

}
