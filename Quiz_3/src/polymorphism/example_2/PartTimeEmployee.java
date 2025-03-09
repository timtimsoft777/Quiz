package polymorphism.example_2;

public class PartTimeEmployee extends Employee {

    private final double hourlySalary;
    private final int dailyWorkedHours;

    public PartTimeEmployee(String name, double hourlySalary, int dailyWorkedHours) {
        super(name);
        this.hourlySalary = hourlySalary;
        this.dailyWorkedHours = dailyWorkedHours;
    }

    @Override
    public double calculateSalary() {
        return (hourlySalary * dailyWorkedHours) * 30;
    }
}
