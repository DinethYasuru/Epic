package Immutable;

public class Immutable {
    private final String username;
    private final int password;

    public Immutable(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public int getPassword() {
        return password;
    }
}
