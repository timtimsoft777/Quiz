package static_members.example_1;

public class User {

    private final String name;
    private static int totalUsers;

    public User(String name) {
        this.name = name;
        totalUsers++;
    }

    public static int getTotalUsers() {
        return totalUsers;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", totalUsers=" + getTotalUsers() + "]";
    }
}
