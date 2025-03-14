package solid.srp;

public class Employee {
    private final String name;
    private final double dailySalary;

    public Employee(String name, double salary) {
        this.name = name;
        this.dailySalary = salary;
    }

    public String getName() {
        return name;
    }

    public double getDailySalary() {
        return dailySalary;
    }
}
