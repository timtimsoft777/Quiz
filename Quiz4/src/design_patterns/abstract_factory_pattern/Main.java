package design_patterns.abstract_factory_pattern;

public class Main {
    public static void main(String[] args) {

        GUIFactory guiFactory;

        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("mac")) {
            guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }

        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.draw();
        checkbox.draw();
    }
}
