
package List;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class VectorEmployee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<Employee> vector = new Vector<>();

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

            vector.add(new Employee(id, name, email, gender, salary));
        }

        System.out.println("\nEmployee Details");

        Enumeration<Employee> e = vector.elements();

        while (e.hasMoreElements()) {
            Employee emp = e.nextElement();
            emp.getEmployeeDetails();
            System.out.println();
        }

        sc.close();
    }
}