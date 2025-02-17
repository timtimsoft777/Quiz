package forLoopDovresi;

import java.util.Scanner;


public class DigitSeparator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int number = scanner.nextInt();

        seperatedDigit(number);

        scanner.close();
    }


    private static void seperatedDigit(int number) {
        if (number < 10) {
            System.out.print(number);
            return;
        }
        seperatedDigit(number / 10);
        System.out.print(", " + number % 10);
    }


}
