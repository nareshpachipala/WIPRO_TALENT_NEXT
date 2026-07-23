package Map;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Key: ");
            String key = sc.nextLine();

            System.out.print("Enter Value: ");
            String value = sc.nextLine();

            map.put(key, value);
        }

        System.out.print("\nEnter key to search: ");
        String key = sc.nextLine();

        if (map.containsKey(key))
            System.out.println("Key Exists");
        else
            System.out.println("Key Not Found");

        System.out.print("\nEnter value to search: ");
        String value = sc.nextLine();

        if (map.containsValue(value))
            System.out.println("Value Exists");
        else
            System.out.println("Value Not Found");

        System.out.println("\nMap Elements:");

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> e = it.next();
            System.out.println(e.getKey() + " = " + e.getValue());
        }

        sc.close();
    }
}
