package MethodReference;

import java.util.Scanner;

public class PrimeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        PrimeInterface p = PrimeNumber::new;

        p.create(n);

        sc.close();
    }
}
