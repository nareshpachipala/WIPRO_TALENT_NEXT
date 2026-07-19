import java.util.Scanner;

public class RemoveFirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() <= 2) {
            System.out.println();
        } else {
            System.out.println(input.substring(1, input.length() - 1));
        }
    }
}
