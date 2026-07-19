import java.util.Scanner;

public class AlternateMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        int length = Math.max(first.length(), second.length());

        for (int i = 0; i < length; i++) {
            if (i < first.length()) {
                result.append(first.charAt(i));
            }

            if (i < second.length()) {
                result.append(second.charAt(i));
            }
        }

        System.out.println(result);
    }
}
