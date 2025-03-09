package encapsulation.example_1;


public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("John Doe");
        student.setGrade(99);

        System.out.println(student);
    }
}
