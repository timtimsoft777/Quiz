package design_patterns.abstract_factory_pattern;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void draw() {
        System.out.println("MacOS Checkbox Draw");
    }
}
