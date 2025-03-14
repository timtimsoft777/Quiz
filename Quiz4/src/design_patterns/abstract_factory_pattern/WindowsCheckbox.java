package design_patterns.abstract_factory_pattern;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void draw() {
        System.out.println("Windows Checkbox Draw");
    }
}
