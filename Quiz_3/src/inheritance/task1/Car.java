package inheritance.task1;

public class Car extends Vehicle {

    private final int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
