package solid.isp;

public class Printer implements Printable {
    @Override
    public void print() {
        System.out.println("Printing a document.");
    }
}
