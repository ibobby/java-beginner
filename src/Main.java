import Astractionism.Figure;
import Astractionism.Rectangle;
import  Dispatchering.*;

public class Main {

    public static void main(String[] args) {
        String a = null;
        try {
            Person person = Person.getPersonInstance(a);
        } catch (IllegalNameException e) {
            System.out.println("Incorrect name");
        }

        VarArgs varArgs = new VarArgs();
        varArgs.varArgs("this is message", 1, 2, 3, 4, 5);

        A variable = new B();
        variable.show();
        //variable.doIt();

        Figure f;
        f = new Rectangle(10, 10);
        f.area();
        Rectangle r = new Rectangle(10, 10);
        r.area();

    }

}
