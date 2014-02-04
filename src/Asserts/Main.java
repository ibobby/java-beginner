package Asserts;

public class Main {

    static int a = 3;

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            decrement();
            assert a > 0;
        }
    }

    private static void decrement() {
        a--;
    }

}
