package OOPS.OOPs_Self.Project_College;

public abstract class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void displayInfo();

    public String toString() {
        return name + " (" + age + ")";
    }

}
