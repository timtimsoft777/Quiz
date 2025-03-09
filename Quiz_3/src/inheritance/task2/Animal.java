package inheritance.task2;

public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound(){
        System.out.println("Make an animal sound.");
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age;
    }
}
