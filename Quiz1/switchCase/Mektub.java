package switchCase;

import java.util.Scanner;


public class Mektub {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Mektub Herfi daxil edin (A,B,C,D): ");
        char grade = scanner.next().toUpperCase().charAt(0);

        checkGrade(grade);

        scanner.close();
    }

    private static void checkGrade(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Əla.");
                break;
            case 'B':
                System.out.println("Yaxşı.");
                break;
            case 'C':
                System.out.println("Kafi.");
                break;
            case 'D':
                System.out.println("Zəif.");
                break;
            default:
                System.out.println("Yalnis mektub herfi");
                break;
        }
    }
}
