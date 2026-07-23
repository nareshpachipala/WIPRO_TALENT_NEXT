package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Employee " + i);

            System.out.print("Emp No: ");
            int no = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Location: ");
            String location = sc.nextLine();

            list.add(new Employee(no, name, age, location));
        }

        List<Employee> pune = list.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("\nEmployees from Pune:");

        pune.forEach(Employee::display);

        sc.close();
    }
}