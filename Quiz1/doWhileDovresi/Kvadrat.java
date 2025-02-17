package doWhileDovresi;

import java.util.Scanner;


public class Kvadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Eded daxil edin: ");
            number = scanner.nextInt();

            if (number != 0){
                int sqr = number * number;
                System.out.println(number  + sqr);
            }

        }
        while (number != 0);

        scanner.close();
    }
}
