import java.util.Scanner;

public class FirstHalf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.length() % 2 == 0) {
            System.out.println(input.substring(0, input.length() / 2));
        } else {
            System.out.println("null");
        }
    }
}
