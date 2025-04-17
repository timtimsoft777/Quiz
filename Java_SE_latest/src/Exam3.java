
    import java.io.*;

    class Student implements Serializable {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', age=" + age + "}";
        }

        public static class Exam3 {
            public static void main(String[] args) {
                Student student = new Student("Gunduz", 22);
                try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
                    oos.writeObject(student);
                    System.out.println("✅ Obyekt fayla yazıldı.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.txt"))) {
                    Student readStudent = (Student) ois.readObject();
                    System.out.println("✅ Fayldan oxunan obyekt: " + readStudent);
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

