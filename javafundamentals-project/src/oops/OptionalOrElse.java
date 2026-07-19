import java.util.Optional;
import java.util.Scanner;

public class OptionalOrElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();

        if (address.isEmpty()) {
            address = null;
        }

        System.out.println(Optional.ofNullable(address).orElse("India"));
    }
}
