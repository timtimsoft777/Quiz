package encapsulation.example_2;


public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setName("Jon");
        employee.setSalary(7777.07);

        System.out.println(employee);

        employee.increaseSalary(15);
        System.out.println("After increase salary: " + employee);
    }
}
