package abstraction.example_1;


public class Main {
    public static void main(String[] args) {

        Car car = new Car("Nissan");
        car.displayBrand();
        car.start();
        car.stop();

        System.out.println();

        Bike bike = new Bike("BMX");
        bike.displayBrand();
        bike.start();
        bike.stop();

    }
}
