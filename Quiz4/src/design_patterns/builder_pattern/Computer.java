package design_patterns.builder_pattern;

public class Computer {
    private final String ram;
    private final String storage;
    private final String cpu;
    private final String graphicsCard;

    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.cpu = builder.cpu;
        this.graphicsCard = builder.graphicsCard;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer [ram=" + getRam() + ", storage=" + getStorage() + ", cpu=" + getCpu()
                + ", graphicsCard=" + getGraphicsCard() + "]";
    }

    public static class ComputerBuilder {
        private String ram;
        private String storage;
        private String cpu;
        private String graphicsCard;

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
