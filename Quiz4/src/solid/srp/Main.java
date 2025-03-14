package solid.srp;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("John Doe", 145.50);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println("Employee monthly salary is : " + salaryCalculator.calculateMonthlySalary(employee.getDailySalary()));

        FileSaver fileSaver = new FileSaver();
        fileSaver.saveToFile(employee);
    }
}
