import java.util.List;

class AuthenticationService {

    private UserStorage userStorage;
    private List<User> users;

    public AuthenticationService(UserStorage userStorage) {
        this.userStorage = userStorage;
        this.users = userStorage.loadUsers();
    }

    public boolean registerUser(String username, String password) {

        if (userExists(username)) {
            System.out.println("Bu istifadeci adi ile qeydiyyat artiq movcuddur.");
            return false;
        }

        String passwordHash = PasswordHasher.hashPassword(password);
        users.add(new User(username, passwordHash));
        userStorage.saveUsers(users);
        System.out.println("Qeydiyyat ugurla tamamlandı!");
        return true;
    }

    public boolean authenticateUser(String username, String password) {
        User user = findUser(username);
        if (user != null && PasswordHasher.verifyPassword(password, user.passwordHash)) {
            System.out.println("Giris ugurludur!");
            return true;
        } else {
            System.out.println("Yanlıs istifadeci adi və ya sifre!");
            return false;
        }
    }

    private boolean userExists(String username) {
        return findUser(username) != null;
    }

    private User findUser(String username) {
        for (User user : users) {
            if (user.username.equals(username)) {
                return user;
            }
        }
        return null;
    }
}
