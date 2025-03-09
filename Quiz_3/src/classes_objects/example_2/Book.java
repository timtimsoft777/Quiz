package classes_objects.example_2;

public class Book {

    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Title : " + this.title + "\nAuthor : " + this.author + "\nYear : " + this.year);
    }
}
