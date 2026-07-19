import java.util.Scanner;

public class FirstTwoRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String firstTwo = input.substring(0, Math.min(2, input.length()));
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            result.append(firstTwo);
        }

        System.out.println(result);
    }
}
