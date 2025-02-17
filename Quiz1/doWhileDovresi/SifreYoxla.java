package doWhileDovresi;

import java.util.Scanner;


public class SifreYoxla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "12345";
        String userPassword;
        int loginAttempts = 0;

        do {
            System.out.print("Sifreni Daxil edin: ");
            userPassword = scanner.nextLine();

            if (!userPassword.equals(correctPassword)) {
                System.out.println("Yalnis Sifre");
                loginAttempts++;
            } else {
                System.out.println("Sifre dogrudur.");
            }

            if (loginAttempts == 3) {
                System.out.println("Sifre yoxlama sayi bitib.");
                break;
            }
        } while (!userPassword.equals(correctPassword));

        scanner.close();
    }
}
