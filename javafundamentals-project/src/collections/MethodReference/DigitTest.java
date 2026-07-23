package MethodReference;

import java.util.Scanner;

public class DigitTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        DigitInterface d = DigitCount::digitCount;

        System.out.println("Digits = " + d.count(n));

        sc.close();
    }
}
