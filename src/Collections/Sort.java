package Collections;

import java.util.Collection;
import java.util.HashSet;
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
        treeStringSet.add(new User("greg", 42));
        System.out.println(treeStringSet);
    }
}

class User implements Comparable{
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

    @Override
    public int compareTo(Object o) {
        if (o == null) return 1;
        User anotherUser = (User) o;
        int dif = getAge() - anotherUser.getAge();
        if (dif == 0) return 1;
        int res = (dif) / Math.abs(dif);
        return res;
    }

    @Override
    public int hashCode() {
        System.out.println("in hashCode");
        return getAge();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("in equals");
        if (obj == null) return false;
        User anotherUser = (User) obj;
        if (getAge() == anotherUser.getAge()) return true;
        return false;
    }
}
