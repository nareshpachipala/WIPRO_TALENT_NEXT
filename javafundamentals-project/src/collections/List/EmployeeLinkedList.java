
package List;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Employee> list = new LinkedList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Email: ");
            String email = sc.next();

            System.out.print("Enter Gender: ");
            String gender = sc.next();

            System.out.print("Enter Salary: ");
            float salary = sc.nextFloat();

            list.add(new Employee(id, name, email, gender, salary));
        }

        System.out.println("\nEmployee Details");

        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println();
        }

        sc.close();
    }
}