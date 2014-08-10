package IO;

import java.io.Serializable;

/**
 * Created by bobby on 10.08.2014.
 */
public class User implements Serializable {

    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
