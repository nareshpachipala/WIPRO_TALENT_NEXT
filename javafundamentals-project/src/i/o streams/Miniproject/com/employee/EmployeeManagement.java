
package Miniproject.com.employee;

import java.io.*;
import java.util.ArrayList;

public class EmployeeManagement {

    private final String fileName = "employees.dat";

    @SuppressWarnings("unchecked")
    public ArrayList<Employee> readEmployees() {

        ArrayList<Employee> list = new ArrayList<>();

        File file = new File(fileName);

        if (!file.exists()) {
            return list;
        }

        try {
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream(fileName));

            list = (ArrayList<Employee>) ois.readObject();

            ois.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    public void addEmployee(Employee emp) {

        ArrayList<Employee> list = readEmployees();

        list.add(emp);

        try {

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream(fileName));

            oos.writeObject(list);

            oos.close();

            System.out.println("Employee Added Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayAll() {

        ArrayList<Employee> list = readEmployees();

        if (list.isEmpty()) {
            System.out.println("No Employees Found.");
            return;
        }

        System.out.println("-----Report-----");

        for (Employee e : list) {
            System.out.println(e);
        }

        System.out.println("-----End of Report-----");
    }
}