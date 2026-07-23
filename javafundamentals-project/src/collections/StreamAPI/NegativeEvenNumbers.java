package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class NegativeEvenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        List<Integer> result = list.stream()
                .filter(x -> x < 0 && x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Negative Even Numbers:");
        result.forEach(System.out::println);

        sc.close();
    }
}