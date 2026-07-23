
package Map;

import java.util.*;

public class CountryMap {

    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
        return M1;
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {
        for (Map.Entry<String, String> e : M1.entrySet()) {
            if (e.getValue().equalsIgnoreCase(capital))
                return e.getKey();
        }
        return null;
    }

    public HashMap<String, String> createM2() {
        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> e : M1.entrySet()) {
            M2.put(e.getValue(), e.getKey());
        }

        return M2;
    }

    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CountryMap obj = new CountryMap();

        System.out.print("Enter number of countries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Country: ");
            String country = sc.nextLine();

            System.out.print("Enter Capital: ");
            String capital = sc.nextLine();

            obj.saveCountryCapital(country, capital);
        }

        System.out.print("\nEnter country to find capital: ");
        String c = sc.nextLine();
        System.out.println("Capital : " + obj.getCapital(c));

        System.out.print("\nEnter capital to find country: ");
        String cap = sc.nextLine();
        System.out.println("Country : " + obj.getCountry(cap));

        System.out.println("\nMap M2 : " + obj.createM2());

        System.out.println("\nCountry List : " + obj.getCountryList());

        sc.close();
    }
}