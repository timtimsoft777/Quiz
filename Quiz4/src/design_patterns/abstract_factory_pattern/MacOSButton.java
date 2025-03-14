package design_patterns.abstract_factory_pattern;

public class MacOSButton implements Button{
    @Override
    public void draw() {
        System.out.println("MacOS Button Draw");
    }
}
