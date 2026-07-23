package MethodReference;

import java.util.Scanner;

public class FactorialTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Factorial obj = new Factorial();

        FactorialInterface f = obj::factorial;

        System.out.println("Factorial = " + f.find(n));

        sc.close();
    }
}
