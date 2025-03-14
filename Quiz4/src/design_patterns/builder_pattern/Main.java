package design_patterns.builder_pattern;

public class Main {
    public static void main(String[] args) {

        Computer officePc = new Computer.ComputerBuilder()
                .setRam("16GB")
                .setStorage("512GB SSD")
                .setCpu("Intel Core i7")
                .build();

        Computer gamingPc = new Computer.ComputerBuilder()
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setCpu("Intel Core i9")
                .setGraphicsCard("NVIDIA RTX 1010T")
                .build();

        System.out.println("For Office\n" + officePc);
        System.out.println("For Gaming\n" + gamingPc);
    }
}
