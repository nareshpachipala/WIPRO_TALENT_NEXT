package LambdaExpressions;

import java.util.Scanner;

public class MyClassWithLambda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        WordCount wc = s -> s.trim().split("\\s+").length;

        System.out.println("Number of words = " + wc.count(str));

        sc.close();
    }
}