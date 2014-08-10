package Collections;

import IO.*;
import IO.User;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by bobby on 10.08.2014.
 */
public class Sets {

    public static void main(String[] args) {

        Set hashSet = new HashSet<Integer>();
        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(3);
        hashSet.add(7);
        hashSet.add(9);
        System.out.println(hashSet);

        Set userSet = new TreeSet<User>();
        userSet.add(new User(1, 28));
        userSet.add(new User(28, 1));
        userSet.add(new User(1, 20));
        userSet.add(new User(1, 43));
        userSet.add(new User(1, 26));
        System.out.println(userSet);

    }

    static class User implements Comparable{
        int id;
        int age;

        User(int id, int age) {
            this.id = id;
            this.age = age;
        }

        @Override
        public int hashCode() {
            System.out.println("in hash");
            return id + age;
        }

        @Override
        public String toString() {
            return id + " " + age + "\n";
        }

        @Override
        public boolean equals(Object obj) {
            System.out.println("in equals");
            if (!(obj instanceof User)) {
                return false;
            }

            User o = (User) obj;

            if (id + age == o.id + o.age) {
              return true;
            }

            return false;
        }

        @Override
        public int compareTo(Object o) {
            if (!(o instanceof User)) {
                return 1;
            }
            User anotherObject = (User) o;
            return age - anotherObject.age;
        }
    }

}
