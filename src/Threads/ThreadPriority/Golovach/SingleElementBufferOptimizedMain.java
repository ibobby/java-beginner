package Threads.ThreadPriority.Golovach;

/**
 * Created by bobby on 23.07.2014.
 */
public class SingleElementBufferOptimizedMain {

    static int gettedValue;

    public static void main(String[] args) {

        SingleElementBufferOptimized bufferOptimized = new SingleElementBufferOptimized();

        Thread producer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        bufferOptimized.put(i);
                    } catch (InterruptedException ignore) {}
                }
            }
        });

        Thread producer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        bufferOptimized.put(i);
                    } catch (InterruptedException ignore) {}
                }
            }
        });

        Thread customer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        gettedValue = bufferOptimized.get();
                    } catch (InterruptedException ignore) {}
                }
            }
        });

        producer1.start();
        producer2.start();
        customer1.start();

    }

}
