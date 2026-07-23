
package Miniproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeList1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee1> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee " + (i + 1) + " details:");

            System.out.print("First name: ");
            String firstName = sc.nextLine();

            System.out.print("Last name: ");
            String lastName = sc.nextLine();

            System.out.print("Mobile number: ");
            String mobileNumber = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            list.add(new Employee1(firstName, lastName, mobileNumber, email, address));
        }

        Collections.sort(list, new Comparator<Employee1>() {
            public int compare(Employee1 e1, Employee1 e2) {
                return e1.firstName.compareToIgnoreCase(e2.firstName);
            }
        });

        System.out.println("\nFirstName\tLastName\tMobileNumber\tEmail\t\tAddress");
        for (Employee1 e : list) {
            System.out.println(e.firstName + "\t\t" + e.lastName + "\t\t" + e.mobileNumber + "\t\t" + e.email + "\t\t" + e.address);
        }

        sc.close();
    }
}