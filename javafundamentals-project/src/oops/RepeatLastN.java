import java.util.Scanner;

public class RepeatLastN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String last = input.substring(input.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(last);
        }

        System.out.println(result);
    }
}
