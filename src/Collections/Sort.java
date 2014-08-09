package Collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bobby on 09.08.2014.
 */
public class Sort {
    public static void main(String[] args) {
        Set<User> treeStringSet = new TreeSet<>();
        treeStringSet.add(new User("bob", 28));
        treeStringSet.add(new User("mike", 32));
        treeStringSet.add(new User("james", 42));
        System.out.println(treeStringSet);
    }
}

class User {
    String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "name = " + getName() + " age = " + getAge();
    }
}
