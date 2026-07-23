
package Miniproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String");
        String s1 = sc.nextLine();

        System.out.println("Enter Second String");
        String s2 = sc.nextLine();

        StringOperation6 obj = new StringOperation6();

        ArrayList<String> result = obj.operations(s1, s2);

        System.out.println(result);

        sc.close();
    }
}