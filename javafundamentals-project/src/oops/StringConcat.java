import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        if (!first.isEmpty() && !second.isEmpty() && first.charAt(first.length() - 1) == second.charAt(0)) {
            second = second.substring(1);
        }

        System.out.println(first + second);
    }
}
