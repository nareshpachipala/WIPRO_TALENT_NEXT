
package Miniproject;

import java.util.*;

public class CardSet3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String, Card3> set = new TreeMap<>();

        int count = 0;

        while (set.size() < 4) {
            System.out.println("Enter a card :");
            String symbol = sc.next();
            int number = sc.nextInt();

            count++;

            if (!set.containsKey(symbol)) {
                set.put(symbol, new Card3(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");
        System.out.println("Cards in Set are :");

        for (Card3 card : set.values()) {
            System.out.println(card.getSymbol() + " " + card.getNumber());
        }

        sc.close();
    }
}