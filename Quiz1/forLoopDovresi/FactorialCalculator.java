package forLoopDovresi;

import java.util.Scanner;


public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);
        System.out.println(number  + factorial);

        scanner.close();
    }

    private static long calculateFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
