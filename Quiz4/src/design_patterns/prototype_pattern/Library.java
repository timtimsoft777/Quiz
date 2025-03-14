package design_patterns.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Library implements Cloneable {
    private final String name;
    private final List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Library clone() {
        Library cloneLibrary = new Library(this.name);

        for (Book book : books) {
            cloneLibrary.addBook(new Book(book.getTitle(), book.getAuthor()));
        }

        return cloneLibrary;
    }

    @Override
    public String toString() {
        return "Library [name=" + name + ", books=" + books + "]";
    }
}
