package design_patterns.prototype_pattern;

public class Main {
    public static void main(String[] args) {

        Library mainLibrary = new Library("Ming Library");
        mainLibrary.addBook(new Book("Animal Farm", "George Orwell"));
        mainLibrary.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        Library cloneLibrary = mainLibrary.clone();

        System.out.println("Main Library\n" + mainLibrary);
        System.out.println("Clone Library\n" + cloneLibrary);

        System.out.println("Instance 1: " + mainLibrary.hashCode() + "\nInstance 2: " + cloneLibrary.hashCode());
        System.out.println(mainLibrary.equals(cloneLibrary));
    }
}
