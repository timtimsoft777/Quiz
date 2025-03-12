import java.util.*;

public class Main {
    private static UserStorage userStorage = new UserStorage();
    private static AuthenticationService authService = new AuthenticationService(userStorage);
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
  for (;;) {
      menu();
      int choice = scanner.nextInt();
      scanner.nextLine();

      if (choice == 1) {
          qeydiyyat();
      } else if (choice == 2) {
          giris();
      }
      else if (choice == 3) {
         cixis();
      } else {
          System.out.println("Yanlis seçim!");
      }
  }
   }

    private static void menu() {
        System.out.println("1. Qeydiyyat");
        System.out.println("2. Giris");
        System.out.println("3. Cixis");
        System.out.print("Seciminizi edin (1/3): ");
    }

    private static void qeydiyyat() {
        System.out.print("İstifadeci adini daxil edin: ");
        String username = scanner.nextLine();
        System.out.print("Sifreni daxil edin: ");
        String password = scanner.nextLine();
        authService.registerUser(username, password);
    }

    private static void giris() {
        System.out.print("İstifadeci adini daxil edin: ");
        String username = scanner.nextLine();
        System.out.print("Sifreni daxil edin: ");
        String password = scanner.nextLine();
        authService.authenticateUser(username, password);
    }

    private static void cixis() {
        System.out.println("Aplikasiya sonlandirilir!");
        System.exit(0);
    }

}
