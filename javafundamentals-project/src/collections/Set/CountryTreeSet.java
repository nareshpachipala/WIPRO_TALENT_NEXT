
package Set;

import java.util.Scanner;
import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> countries = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {
        countries.add(countryName);
        return countries;
    }

    public String getCountry(String countryName) {

        for (String country : countries) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CountryTreeSet obj = new CountryTreeSet();

        System.out.print("Enter number of countries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name: ");
            obj.saveCountryNames(sc.nextLine());
        }

        System.out.print("Enter country to search: ");
        String search = sc.nextLine();

        String result = obj.getCountry(search);

        if (result != null) {
            System.out.println("Country Found: " + result);
        } else {
            System.out.println("Country Not Found");
        }

        sc.close();
    }
}