package FunctionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.function.Consumer;

public class ReverseWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter words:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Consumer<ArrayList<String>> reverse = l -> {
            Collections.reverse(l);
            System.out.println("Reverse Order:");
            for (String s : l) {
                System.out.println(s);
            }
        };

        reverse.accept(list);

        sc.close();
    }
}
