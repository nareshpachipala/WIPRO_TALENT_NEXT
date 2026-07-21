import java.util.Scanner;

class InvalidCountryException extends Exception {
    InvalidCountryException(String m) { super(m); }
}

public class UserRegistration {
    void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!"India".equals(userCountry)) throw new InvalidCountryException("User Outside India cannot be registered");
        System.out.println("User registration done successfully");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String u = sc.nextLine();
        System.out.println("Enter country");
        String c = sc.nextLine();
        new UserRegistration().registerUser(u, c);
    }
}
