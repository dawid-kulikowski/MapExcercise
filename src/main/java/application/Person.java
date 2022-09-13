package application;

public class Person {
    String name;
    String surname;
    String age;

    public Person(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = '" + age + '\'';
    }
}
