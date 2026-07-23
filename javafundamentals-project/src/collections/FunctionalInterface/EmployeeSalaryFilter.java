
package FunctionalInterface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<EmployeeInfo> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Location: ");
            String location = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            list.add(new EmployeeInfo(id, name, location, salary));
        }

        Predicate<EmployeeInfo> p = e -> e.getSalary() > 50000;

        System.out.println("\nEmployees with Salary > 50000");

        for (EmployeeInfo e : list) {
            if (p.test(e)) {
                System.out.println(e.getName());
            }
        }

        sc.close();
    }
}