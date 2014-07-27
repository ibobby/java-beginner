package Threads.ThreadPriority.Golovach.DifferentBuffers;

/**
 * Created by bobby on 22.07.2014.
 */
public class Main {

    public static void main(String[] args) {
        try {
            RabbitPrinter rabbitPrinter = new RabbitPrinter(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
