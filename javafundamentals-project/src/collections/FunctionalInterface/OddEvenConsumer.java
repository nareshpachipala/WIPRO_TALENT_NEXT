package FunctionalInterface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        Consumer<ArrayList<Integer>> consumer = l -> {

            System.out.println("Even Numbers:");
            for (int num : l) {
                if (num % 2 == 0)
                    System.out.println(num);
            }

            System.out.println("Odd Numbers:");
            for (int num : l) {
                if (num % 2 != 0)
                    System.out.println(num);
            }
        };

        consumer.accept(list);

        sc.close();
    }
}
