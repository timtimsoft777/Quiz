package abstraction.example_2;

abstract class Shape {

    public abstract double calculateArea();

    public void displayInfo(){
        System.out.println("Area: " + calculateArea());
    }
}
