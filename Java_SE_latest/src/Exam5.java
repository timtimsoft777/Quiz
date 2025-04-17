
    import java.util.*;
    class Employee implements Comparable<Employee> {
        private String name;
        private int age;
        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }
        @Override
        public int compareTo(Employee other) {
            return Integer.compare(this.age, other.age);
        }
        @Override
        public String toString() {
            return name + " (" + age + " yaş)";
        }
    }
    public class Exam5 {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Ali", 25));
            employees.add(new Employee("Aysel", 30));
            employees.add(new Employee("Murad", 22));
            Collections.sort(employees);
            System.out.println("Yaşa görə sıralanmış əməkdaşlar:");
            for (Employee e : employees) {
                System.out.println(e);
            }
        }
    }

