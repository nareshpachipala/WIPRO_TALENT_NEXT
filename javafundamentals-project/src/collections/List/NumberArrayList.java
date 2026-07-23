package List;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();

        System.out.print("Enter an integer: ");
        int a = sc.nextInt();

        System.out.print("Enter a float: ");
        float b = sc.nextFloat();

        System.out.print("Enter a double: ");
        double c = sc.nextDouble();

        list.add(a);
        list.add(b);
        list.add(c);

        System.out.println("\nNumbers in ArrayList:");

        for (Number n : list) {
            System.out.println(n);
        }
    }
}