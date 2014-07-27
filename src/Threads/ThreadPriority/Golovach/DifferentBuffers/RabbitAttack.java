package Threads.ThreadPriority.Golovach.DifferentBuffers;

/**
 * Created by bobby on 22.07.2014.
 */
public class RabbitAttack {

    public static void main(String[] args) throws InterruptedException {
        for (int k = 0; k < 10000000; k++) {
            ThreadPrinter printer = new ThreadPrinter(space(k) + k, 100);
            Thread thread = new Thread(printer);
            thread.start();
            thread.sleep(100);
        }
    }

    private static String space(int k) {
        StringBuffer strBuf = new StringBuffer();
        for (int i = 0; i < k; i++) {
            strBuf.append(" ");
        }
        return strBuf.toString();
    }

}
