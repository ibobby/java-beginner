
public class IllegalNameException extends Exception{

    IllegalNameException(String name) {
        super(name);
        System.out.println("Person name is incorrect");
    }

}
