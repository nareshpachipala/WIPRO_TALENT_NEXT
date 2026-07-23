package FunctionalInterface;

import java.util.Scanner;
import java.util.function.Supplier;

public class PrimeSupplier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Supplier<Boolean> supplier = () -> {

            if (num < 2)
                return false;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0)
                    return false;
            }

            return true;
        };

        if (supplier.get())
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is Not Prime");

        sc.close();
    }
}