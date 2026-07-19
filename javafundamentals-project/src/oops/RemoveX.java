import java.util.Scanner;

public class RemoveX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int start = 0;
        int end = input.length();

        if (start < end && input.charAt(start) == 'x') {
            start++;
        }

        if (start < end && input.charAt(end - 1) == 'x') {
            end--;
        }

        System.out.println(input.substring(start, end));
    }
}
