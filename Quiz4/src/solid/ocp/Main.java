package solid.ocp;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 5);
        System.out.println("Rectangle area: " + rectangle.area());

        Shape circle = new Circle(5);
        System.out.println("Circle area: " + circle.area());
    }
}
