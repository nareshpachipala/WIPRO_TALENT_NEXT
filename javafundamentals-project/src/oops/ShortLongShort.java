import java.util.Scanner;

public class ShortLongShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        if (first.length() < second.length()) {
            System.out.println(first + second + first);
        } else {
            System.out.println(second + first + second);
        }
    }
}
