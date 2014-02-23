package Threads.ThreadPriority.NewThreads;

import Generics.OgranichenShablony.ThreeD;

public class Main {

    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("HELLO");
            }

            });
        t.start();

    }

}
