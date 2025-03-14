package design_patterns.abstract_factory_pattern;

public class WindowsButton implements Button {
    @Override
    public void draw() {
        System.out.println("Windows Button Draw");
    }
}
