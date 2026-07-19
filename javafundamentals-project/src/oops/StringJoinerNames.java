import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            names.add(scanner.nextLine());
        }

        StringJoiner joiner = new StringJoiner(",", "{", "}");
        names.forEach(joiner::add);
        System.out.println(joiner);
    }
}
