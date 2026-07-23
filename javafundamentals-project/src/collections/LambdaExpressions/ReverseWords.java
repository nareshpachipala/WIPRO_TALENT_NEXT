package LambdaExpressions;

import java.util.*;

public class ReverseWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> a1 = new ArrayList<>();

        System.out.println("Enter 10 words:");

        for (int i = 0; i < 10; i++) {
            a1.add(sc.next());
        }

        System.out.println("Reverse Order:");

        a1.stream()
          .sorted((a, b) -> b.compareTo(a))
          .forEach(System.out::println);

        sc.close();
    }
}