package polymorphism.example_2;

public class FullTimeEmployee extends Employee {

    private final double dailySalary;

    public FullTimeEmployee(String name, double dailySalary) {
        super(name);
        this.dailySalary = dailySalary;
    }

    @Override
    public double calculateSalary() {
        return dailySalary * 45;
    }
}
