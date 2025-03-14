package solid.lsp;

public class Main {
    public static void main(String[] args) {

        FlyingBird sparrow = new Sparrow("Sparrow", "Flying");
        sparrow.display();
        sparrow.fly();

        NonFlyingBird penguin = new Penguin("Penguin", "Non flying");
        penguin.display();
    }
}
