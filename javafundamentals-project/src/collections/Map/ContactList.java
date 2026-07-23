package Map;

import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> contacts = new HashMap<>();

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            int phone = sc.nextInt();
            sc.nextLine();

            contacts.put(name, phone);
        }

        System.out.print("\nEnter name to search: ");
        String name = sc.nextLine();

        if (contacts.containsKey(name))
            System.out.println("Key Exists");
        else
            System.out.println("Key Not Found");

        System.out.print("\nEnter phone number to search: ");
        int phone = sc.nextInt();

        if (contacts.containsValue(phone))
            System.out.println("Value Exists");
        else
            System.out.println("Value Not Found");

        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> e = it.next();
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        sc.close();
    }
}
