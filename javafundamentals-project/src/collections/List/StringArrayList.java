
package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StringArrayList {

    public static void printAll(ArrayList<String> list) {

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter String " + (i + 1) + ": ");
            list.add(sc.nextLine());
        }

        System.out.println("\nArrayList Elements:");
        printAll(list);
    }
}