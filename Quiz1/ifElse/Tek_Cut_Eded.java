package ifElse;

import java.util.Scanner;


public class Tek_Cut_Eded {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " cutdur");
        } else {
            System.out.println(number + " tekdir");
        }

        scanner.close();
    }
}
