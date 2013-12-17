package Astractionism;

public class Rectangle extends Figure{

    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public void area() {
        int s = a*b;
        System.out.println("the area of rectangle = " + s);
   }

}
