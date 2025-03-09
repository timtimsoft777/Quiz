package polymorphism.example_1;


public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        double circleArea = circle.calculateArea();
        System.out.println("The circle area is: " + circleArea);

        Rectangle rectangle = new Rectangle(10, 10);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("The rectangle area is: " + rectangleArea);
    }
}
