package design_patterns.singleton_pattern;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Instance 1: " + s1 + "\nInstance 2: " + s2);
        System.out.println("Instance 1: " + s1.hashCode() + "\nInstance 2: " + s2.hashCode());
        System.out.println(s1.equals(s2));
    }
}
