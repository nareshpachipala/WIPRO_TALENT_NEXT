package LambdaExpressions;

import java.util.*;
import java.util.function.Predicate;

public class PrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a1 = new ArrayList<>();

        System.out.print("Enter 25 numbers:\n");

        for (int i = 0; i < 25; i++) {
            a1.add(sc.nextInt());
        }

        Predicate<Integer> prime = n -> {
            if (n < 2)
                return false;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0)
                    return false;
            }
            return true;
        };

        System.out.println("Prime Numbers:");

        a1.stream().filter(prime).forEach(System.out::println);

        sc.close();
    }
}