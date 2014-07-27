package Threads.ThreadPriority.Golovach.DifferentBuffers;

/**
 * Created by bobby on 22.07.2014.
 */
public class RabbitPrinter {

    private Thread printer;
    private long sleepTime;

    public RabbitPrinter(long sleepTime) throws InterruptedException {
        this.sleepTime = sleepTime;
        rabbitGenerator();
    }

    private void rabbitGenerator() throws InterruptedException {
        for (int k = 0; k < 10000000; k++) {
            final int finalK = k;
            printer = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(sleepTime);
                    } catch (InterruptedException e) {
                        throw new RuntimeException();
                    }

                    System.out.println(space(finalK) + finalK);
                }
            });
            printer.start();
            printer.sleep(100);
        }
    }

    private String space(int k) {
        StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i < k; i++) {
            strBuf.append(" ");
        }
        return strBuf.toString();
    }

}
