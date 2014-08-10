package IO;

import java.io.*;

/**
 * Created by bobby on 10.08.2014.
 */
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new ObjectOutputStream(new FileOutputStream("C:/temp/test.uuu")).writeObject(new User("Mike", 34));
        User userFromFile = (User) new ObjectInputStream(new FileInputStream("C:/temp/test.uuu")).readObject();
        System.out.println(userFromFile.name);
        System.out.println(userFromFile.age);
    }


}
