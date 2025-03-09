package polymorphism.example_2;

abstract class Employee {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public void displayInfo(){
        System.out.println("Name: " + name + " Salary: " + calculateSalary());
    }
}
