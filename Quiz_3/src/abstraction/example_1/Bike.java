package abstraction.example_1;

public class Bike extends Vehicle{

    public Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(this.brand + " start");
    }

    @Override
    public void stop() {
        System.out.println(this.brand + " stop");
    }
}
