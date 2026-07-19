import java.util.Scanner;

public class RemoveStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean[] remove = new boolean[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '*') {
                remove[i] = true;

                if (i > 0) {
                    remove[i - 1] = true;
                }

                if (i < input.length() - 1) {
                    remove[i + 1] = true;
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (!remove[i]) {
                result.append(input.charAt(i));
            }
        }

        System.out.println(result);
    }
}
