package whileDovresi;

import java.util.Scanner;


public class EdedlerinCemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int number = scanner.nextInt();

        int sum = sumDigits(number);

        System.out.println("Cem: " + sum);

        scanner.close();
    }

    private static int sumDigits(int number) {
        String digits = Integer.toString(number);

        int sum = 0;

        while (number > 0) {
            for (int i = 0; i < digits.length(); i++) {
                sum += Integer.parseInt(String.valueOf(digits.charAt(i)));
            }
            number = 0;
        }
        return sum;
    }
}
