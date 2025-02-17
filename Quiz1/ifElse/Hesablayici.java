package ifElse;

import java.util.Scanner;


public class Hesablayici {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1-ci eded: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("2-ci eded: ");
        double secondNumber = scanner.nextDouble();
        System.out.print("operator(+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        calculate(firstNumber, secondNumber, operator);

        scanner.close();
    }

    private static void calculate(double firstNumber, double secondNumber, char operator) {
        double result;
        if (operator == '+') {
            result = firstNumber + secondNumber;
            System.out.println("Netice: " + result);
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
            System.out.println("Netice: " + result);
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
            System.out.println("Netice: " + result);
        } else if (operator == '/') {
            if (secondNumber != 0) {
                result = firstNumber / secondNumber;
                System.out.println("Netice: " + result);
            } else {
                System.out.println("0 daxil etmek olmaz");
            }
        } else {
            System.out.println("Bele bir operator yoxdur" + operator);
        }
    }
}
