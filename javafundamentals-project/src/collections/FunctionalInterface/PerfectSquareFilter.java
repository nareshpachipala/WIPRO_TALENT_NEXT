package FunctionalInterface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PerfectSquareFilter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Predicate<Integer> square = x -> {
            int s = (int) Math.sqrt(x);
            return s * s == x;
        };

        System.out.println("Perfect Square Numbers:");

        for (int num : list) {
            if (square.test(num)) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}