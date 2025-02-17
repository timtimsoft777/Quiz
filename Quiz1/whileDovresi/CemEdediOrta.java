package whileDovresi;

import java.util.Scanner;


public class CemEdediOrta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int countOfInputNumbers = 0;
        int number;

        while(true){
            System.out.print("Eded daxil edin: ");
            number = scanner.nextInt();

            if(number == 0){
                break;
            }

            sum += number;
            countOfInputNumbers++;
        }

        double average = (double) sum/countOfInputNumbers;
        System.out.println("Cem: " + sum);
        System.out.println("Ededi Orta: " + average);

        scanner.close();
    }
}
