package switchCase;

import java.util.Scanner;


public class Ay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ayın sıra nömrəsin daxil edin(1-12): ");
        int month = scanner.nextInt();

        String monthName = findMonth(month);
        System.out.print("Ay adı: " + monthName);

        scanner.close();
    }

    private static String findMonth(int month) {
        return switch (month) {
            case 1 -> "Yanvar";
            case 2 -> "Fevral";
            case 3 -> "Mart";
            case 4 -> "Aprel";
            case 5 -> "May";
            case 6 -> "Iyun";
            case 7 -> "Iyul";
            case 8 -> "Avqust";
            case 9 -> "Sentyabr";
            case 10 -> "Oktyabr";
            case 11 -> "Noyabr";
            case 12 -> "Dekabr";
            default -> "Yalnış Ay";
        };
    }
}
