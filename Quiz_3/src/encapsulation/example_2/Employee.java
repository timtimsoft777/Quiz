package encapsulation.example_2;

public class Employee {

    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void increaseSalary(double percent) {
        if(percent > 0) {
            salary += salary * (percent / 100);
        }
        else {
            System.err.println("You must enter a positive number");
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Salary: " + getSalary();
    }
}
