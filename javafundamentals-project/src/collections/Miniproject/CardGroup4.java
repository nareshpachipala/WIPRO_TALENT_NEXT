
package Miniproject;

import java.util.*;

public class CardGroup4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<String, ArrayList<Card4>> map = new TreeMap<>();

        System.out.println("Enter Number of Cards :");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter card " + i + ":");
            String symbol = sc.next();
            int number = sc.nextInt();

            Card4 card = new Card4(symbol, number);

            if (!map.containsKey(symbol)) {
                map.put(symbol, new ArrayList<Card4>());
            }

            map.get(symbol).add(card);
        }

        System.out.println("Distinct Symbols are :");

        for (String symbol : map.keySet()) {
            System.out.print(symbol + " ");
        }

        System.out.println();

        for (String symbol : map.keySet()) {

            ArrayList<Card4> list = map.get(symbol);

            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;

            for (Card4 card : list) {
                System.out.println(card.getSymbol() + " " + card.getNumber());
                sum += card.getNumber();
            }

            System.out.println("Number of cards : " + list.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}