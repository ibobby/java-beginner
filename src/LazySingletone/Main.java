package LazySingletone;

public class Main {

    public static void main(String[] args) {
        System.out.println("line 1");
        testSingletone();
        System.out.println("line 2");
    }

    private static void testSingletone() {
        System.out.println(Settings.getGameName());

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Settings.getInstance();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }

}
