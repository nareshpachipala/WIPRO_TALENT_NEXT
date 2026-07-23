package Set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

public class TreeSetDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<String> set = new TreeSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter String: ");
            set.add(sc.nextLine());
        }

        // Reverse the elements
        ArrayList<String> list = new ArrayList<>(set);
        Collections.reverse(list);

        System.out.println("\nReverse Order:");
        for (String s : list) {
            System.out.println(s);
        }

        // Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Search
        System.out.print("\nEnter element to search: ");
        String search = sc.nextLine();

        if (set.contains(search)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}
