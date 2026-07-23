
package FunctionalInterface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PalindromeWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter 10 words:");

        for (int i = 0; i < 10; i++) {
            words.add(sc.next());
        }

        Predicate<String> isPalindrome = word -> {
            String rev = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(rev);
        };

        System.out.println("Palindrome Words:");

        for (String word : words) {
            if (isPalindrome.test(word)) {
                System.out.println(word);
            }
        }

        sc.close();
    }
}