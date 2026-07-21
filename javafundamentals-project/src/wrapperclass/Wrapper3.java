
package wrapperclass;

import java.util.Scanner;

public class Wrapper3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-255): ");
        int number = sc.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Invalid Input");
        } else {

            String binary = Integer.toBinaryString(number);

            binary = String.format("%8s", binary).replace(' ', '0');

            System.out.println("Binary Representation : " + binary);
        }

        sc.close();
    }
}