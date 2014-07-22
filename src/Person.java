
public class Person {

    String name;
    int age;

    private Person(String name) {
        this.name = name;
    }

    public static Person getPersonInstance(String name) throws IllegalNameException {
        if (name == null) {
            throw new IllegalNameException(name);
        }
        Person person = new Person(name);
        return person;
    }

}
