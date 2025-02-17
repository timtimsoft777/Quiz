package whileDovresi;

import java.util.Scanner;


public class EdedleriTopla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;
        int positive = 1;

        while (true) {
            System.out.print("Eded daxil edin: ");
            number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            while (positive <= number) {
                sum += positive;
                positive++;
            }

            System.out.println(number  + sum);
        }

        scanner.close();
    }
}
