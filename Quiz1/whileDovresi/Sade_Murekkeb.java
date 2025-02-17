package whileDovresi;

import java.util.Scanner;

public class Sade_Murekkeb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " murekkeb.");
        } else {
            System.out.println(number + " sade.");
        }

        scanner.close();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        int i = 2;
        while (i <= number / 2) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
