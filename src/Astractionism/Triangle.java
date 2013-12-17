package Astractionism;

public class Triangle extends Figure{

    public Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public void area() {
        int s = a*b;
        System.out.println("the area of triangle = " + s);
    }

}
