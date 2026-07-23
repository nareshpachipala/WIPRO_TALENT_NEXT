
package List;

import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {

        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip\nEmployee ID : " + e.empId +
                        "\nEmployee Name : " + e.empName +
                        "\nSalary : " + e.salary;
            }
        }
        return "Employee Not Found";
    }

    void displayEmployees() {

        if (list.isEmpty()) {
            System.out.println("No Employees");
        } else {
            for (Employee e : list) {
                e.getEmployeeDetails();
                System.out.println();
            }
        }
    }
}