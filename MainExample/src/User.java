import java.io.Serializable;

class User implements Serializable {
    String username;
    String passwordHash;

    public User(String username, String passwordHash) {
        this.username = username;
        this.passwordHash = passwordHash;
    }
}