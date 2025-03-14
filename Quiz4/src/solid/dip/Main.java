package solid.dip;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Kamran");

        Calculator salaryCalculator = new SalaryCalculator();
        EmployeeService employeeService = new EmployeeService(salaryCalculator);

        System.out.println("Employee Name: " + employee.getName() +
                "\nSalary: " + employeeService.getSalary(employee));
    }
}
