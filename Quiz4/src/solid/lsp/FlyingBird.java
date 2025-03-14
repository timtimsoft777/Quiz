package solid.lsp;

abstract class FlyingBird extends Bird {

    public FlyingBird(String name, String type) {
        super(name, type);
    }

    public void fly() {
        System.out.println(getName() + " is flying bird.");
    }
}