package ifElse;

import java.util.Scanner;


public class Beraber_Eded {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1-ci eded: ");
        int firstNumber = scanner.nextInt();
        System.out.print("2-ci eded: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber==secondNumber) {
            System.out.println("Ededler beraberdir");
        } else {
            System.out.println("Ededler beraber deyil");
        }

        scanner.close();
    }


}
