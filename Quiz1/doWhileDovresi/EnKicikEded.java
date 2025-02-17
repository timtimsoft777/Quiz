package doWhileDovresi;

import java.util.Scanner;


public class EnKicikEded {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int minNumber = Integer.MAX_VALUE;

        do {
            System.out.print("Eded daxil edin: ");
            number = scanner.nextInt();

            if (number != 0 && number < minNumber) {
                minNumber = number;
            }
        } while (number != 0);

        System.out.println("En kicik eded: " + minNumber);

        scanner.close();
    }
}
