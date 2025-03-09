package encapsulation.example_1;


public class Student {

    private String name;
    private int grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            System.err.println("Invalid grade. Grade must be between 0 and 100");
        }
    }

    @Override
    public String toString(){
        return "Name: " + getName() + ", Grade: " + getGrade();
    }
}
