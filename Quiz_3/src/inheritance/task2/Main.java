package inheritance.task2;


public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("HavHav", 2);
        dog.makeSound();
        System.out.println(dog);

        Cat cat = new Cat("MioMio", 1);
        cat.makeSound();
        System.out.println(cat);
    }
}
