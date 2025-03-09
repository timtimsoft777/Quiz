package inheritance.task2;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("This is a dog sound.");
    }
}
