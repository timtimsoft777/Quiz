package solid.isp;

public class Main {
    public static void main(String[] args) {

        Printable printer = new Printer();
        printer.print();

        Scannable scanner = new Scanner();
        scanner.scan();
    }
}
