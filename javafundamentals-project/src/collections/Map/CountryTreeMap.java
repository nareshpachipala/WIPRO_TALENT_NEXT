
package Map;

import java.util.*;

public class CountryTreeMap {

    TreeMap<String, String> M1 = new TreeMap<>();

    public void saveCountryCapital(String country, String capital) {
        M1.put(country, capital);
    }

    public String getCapital(String country) {
        return M1.get(country);
    }

    public String getCountry(String capital) {

        for (Map.Entry<String, String> e : M1.entrySet()) {
            if (e.getValue().equalsIgnoreCase(capital)) {
                return e.getKey();
            }
        }
        return null;
    }

    public TreeMap<String, String> createM2() {

        TreeMap<String, String> M2 = new TreeMap<>();

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
        CountryTreeMap obj = new CountryTreeMap();

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

        System.out.print("\nEnter Country to find Capital: ");
        String country = sc.nextLine();
        System.out.println("Capital : " + obj.getCapital(country));

        System.out.print("\nEnter Capital to find Country: ");
        String capital = sc.nextLine();
        System.out.println("Country : " + obj.getCountry(capital));

        System.out.println("\nM2 Map : " + obj.createM2());

        System.out.println("\nCountry List : " + obj.getCountryList());

        sc.close();
    }
}