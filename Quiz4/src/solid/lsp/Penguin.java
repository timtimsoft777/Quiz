package solid.lsp;

public class Penguin extends NonFlyingBird{

    public Penguin(String name, String type) {
        super(name, type);
    }

    @Override
    public void display() {
        System.out.println(getName() + " is non flying bird. Because, this bird type is " + getType());
    }
}
