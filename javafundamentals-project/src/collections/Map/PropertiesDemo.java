package Map;

import java.util.*;

public class PropertiesDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Properties p = new Properties();

        System.out.print("Enter number of states: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter State: ");
            String state = sc.nextLine();

            System.out.print("Enter Capital: ");
            String capital = sc.nextLine();

            p.setProperty(state, capital);
        }

        System.out.println("\nStates and Capitals:");

        Iterator<Object> it = p.keySet().iterator();

        while (it.hasNext()) {
            String state = (String) it.next();
            System.out.println(state + " -> " + p.getProperty(state));
        }

        sc.close();
    }
}