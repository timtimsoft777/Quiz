package classes_objects.example_1;

public class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Name : " + this.name + "\nAge : " + this.age);
    }
}
