package solid.lsp;

public class Sparrow extends FlyingBird{

    public Sparrow(String name, String type) {
        super(name, type);
    }

    @Override
    public void display() {
        System.out.println(getName() + " is flying bird. Because, this bird's type is " + getType());
    }
}
