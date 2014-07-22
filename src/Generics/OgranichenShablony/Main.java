package Generics.OgranichenShablony;

public class Main {

    public static void main(String[] args) {
        TwoD[] twoDs = {new TwoD(1, 2),
                        new TwoD(5, 10)};

        Coords co2d = new Coords<TwoD>(twoDs);
        showXY(co2d);

        //showXYZ(co2d);

        ThreeD[] threeDs = {new ThreeD(1, 1, 1),
                            new ThreeD(5, 5, 4)};
        Coords co3d = new Coords<ThreeD>(threeDs);
        showXY(co3d);
        showXYZ(co3d);
    }

    static void showXY(Coords <?> c) {
        System.out.println("2D coordinats");
        System.out.println(c.coords[0].x);
        System.out.println(c.coords[0].y);
    }

    static void showXYZ(Coords <? extends ThreeD> c) {
        System.out.println("3D coordinats");
        System.out.println(c.coords[0].x);
        System.out.println(c.coords[0].y);
        System.out.println(c.coords[0].z);
    }

}
