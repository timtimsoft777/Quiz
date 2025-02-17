package ifElse;

import java.util.Scanner;


public class Sade_Murekkeb {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " murekkeb ededdir.");
        } else {
            System.out.println(number + " sade ededdir.");
        }

        scanner.close();
    }


    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
