package Set;

import java.util.HashSet;
import java.util.Scanner;

public class CountrySet {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {

        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CountrySet obj = new CountrySet();

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