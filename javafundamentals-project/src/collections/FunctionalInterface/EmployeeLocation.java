package FunctionalInterface;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;

public class EmployeeLocation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Employee " + (i + 1) + " Details");

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

            list.add(new Employee(id, name, location, salary));
        }

        Function<Employee, String> fun = emp -> emp.getLocation();

        ArrayList<String> locations = new ArrayList<>();

        for (Employee e : list) {
            locations.add(fun.apply(e));
        }

        System.out.println("\nEmployee Locations:");
        for (String loc : locations) {
            System.out.println(loc);
        }

        sc.close();
    }
}