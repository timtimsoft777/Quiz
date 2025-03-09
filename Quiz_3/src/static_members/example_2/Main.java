package static_members.example_2;

/**
 * Static members: Task 2
 */
public class Main {
    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 6;
        int number3 = 7;
        int number4 = 8;

        System.out.println(number1 + " cube: " +MathUtils.cube(number1));
        System.out.println(number2 + " cube: " +MathUtils.cube(number2));

        System.out.println(number3 + " square: " +MathUtils.square(number3));
        System.out.println(number4 + " square: " +MathUtils.square(number4));
    }
}
