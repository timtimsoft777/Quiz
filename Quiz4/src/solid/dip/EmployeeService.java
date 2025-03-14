package solid.dip;

public class EmployeeService {
    Calculator calculator;

    public EmployeeService(Calculator calculator) {
        this.calculator = calculator;
    }

    public double getSalary(Employee employee) {
        return calculator.calculateSalary(employee);
    }
}
