package doWhileDovresi;

import java.util.Scanner;


public class EnBoyukTap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int maxNumber = Integer.MIN_VALUE;

        do {
            System.out.print("Eded daxil edin: ");
            number = scanner.nextInt();

            if (number != 0 && number > maxNumber) {
                maxNumber = number;
            }
        } while (number != 0);

        System.out.println("En boyuk eded " + maxNumber);

        scanner.close();
    }
}
