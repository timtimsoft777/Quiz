package forLoopDovresi;

import java.util.Scanner;


public class EdedTopla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin ");
        int number = scanner.nextInt();

        int sum = calculateSum(number);
        System.out.println("Edede qeder butun ededlerin cemi: " + sum);

        scanner.close();
    }

    private static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;

    }
}