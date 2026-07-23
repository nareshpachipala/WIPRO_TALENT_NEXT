package LambdaExpressions;

import java.util.*;

public class OddLengthStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> a1 = new ArrayList<>();

        System.out.println("Enter 10 words:");

        for (int i = 0; i < 10; i++) {
            a1.add(sc.next());
        }

        System.out.println("Odd Length Strings:");

        a1.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(System.out::println);

        sc.close();
    }
}
