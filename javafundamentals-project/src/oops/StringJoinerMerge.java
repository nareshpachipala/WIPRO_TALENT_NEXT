import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringJoinerMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstCount = Integer.parseInt(scanner.nextLine());
        ArrayList<String> firstCities = new ArrayList<>();

        for (int i = 0; i < firstCount; i++) {
            firstCities.add(scanner.nextLine());
        }

        int secondCount = Integer.parseInt(scanner.nextLine());
        ArrayList<String> secondCities = new ArrayList<>();

        for (int i = 0; i < secondCount; i++) {
            secondCities.add(scanner.nextLine());
        }

        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");
        StringJoiner s1Copy = new StringJoiner("-");
        StringJoiner s2Copy = new StringJoiner("-");
        firstCities.forEach(city -> {
            s1.add(city);
            s1Copy.add(city);
        });
        secondCities.forEach(city -> {
            s2.add(city);
            s2Copy.add(city);
        });

        System.out.println(s2.merge(s1));
        System.out.println(s1Copy.merge(s2Copy));
    }
}
