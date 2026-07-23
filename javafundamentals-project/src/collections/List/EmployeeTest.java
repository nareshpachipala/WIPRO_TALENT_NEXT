package List;

import java.util.Scanner;

public class EmployeeTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeDB db = new EmployeeDB();

        int choice;

        do {

            System.out.println("\n1.Add Employee");
            System.out.println("2.Display Employees");
            System.out.println("3.Delete Employee");
            System.out.println("4.Show Payslip");
            System.out.println("5.Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();

                    System.out.print("Enter Name : ");
                    String name = sc.next();

                    System.out.print("Enter Email : ");
                    String email = sc.next();

                    System.out.print("Enter Gender : ");
                    String gender = sc.next();

                    System.out.print("Enter Salary : ");
                    float salary = sc.nextFloat();

                    Employee e = new Employee(id, name, email, gender, salary);
                    db.addEmployee(e);

                    System.out.println("Employee Added");
                    break;

                case 2:
                    db.displayEmployees();
                    break;

                case 3:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();

                    if (db.deleteEmployee(id))
                        System.out.println("Employee Deleted");
                    else
                        System.out.println("Employee Not Found");

                    break;

                case 4:

                    System.out.print("Enter Employee ID : ");
                    id = sc.nextInt();

                    System.out.println(db.showPaySlip(id));
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}