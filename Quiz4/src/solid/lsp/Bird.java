package solid.lsp;

abstract class Bird {
    String name;
    String type;

    public Bird(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public abstract void display();
}
