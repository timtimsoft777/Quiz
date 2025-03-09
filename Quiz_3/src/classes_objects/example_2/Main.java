package classes_objects.example_2;


public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Xəyanət", "Elxan Elatlı", 2012);
        Book book2 = new Book("Yalan nöqtəsi", "Dan Brown", 2005);

        book1.displayDetails();
        book2.displayDetails();
    }
}
