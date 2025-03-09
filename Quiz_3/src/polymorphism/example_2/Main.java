package polymorphism.example_2;


public class Main {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Employee1", 75);
        fullTimeEmployee.displayInfo();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Employee2", 15, 8);
        partTimeEmployee.displayInfo();
    }
}
