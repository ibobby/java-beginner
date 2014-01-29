package Enums;

public class EnumWithConstructor {

    enum Apple {
        Red(1), Green(), Yellow(3);

        int price;
        Apple(int price) {
            this.price = price;
        }

        Apple() {
            this.price = -1;
        }

        int getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {
        Apple ap;
        System.out.println("Price of red " + Apple.Red.getPrice());
        System.out.println("Price of yellow " + Apple.Yellow.getPrice());

        System.out.println("All prices:");

        for (Apple apple: Apple.values()) {
            System.out.println(apple + " price " + apple.getPrice());
        }

    }

}
