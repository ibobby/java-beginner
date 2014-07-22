package Threads.ThreadPriority.Golovach;

/**
 * Created by bobby on 22.07.2014.
 */
public class Main {

    public static void main(String[] args) {
        try {
            RabbitPrinter rabbitPrinter = new RabbitPrinter(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
