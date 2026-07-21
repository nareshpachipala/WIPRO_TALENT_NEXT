
package wrapperclass;

class Employee implements Cloneable {

    private int empId;
    private String empName;
    private double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    // Setter methods
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}

public class Wrapper4 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee original = new Employee(101, "Manoj", 50000);

        Employee clone = (Employee) original.clone();

        // Change cloned object
        clone.setEmpId(102);
        clone.setEmpName("Rahul");
        clone.setSalary(60000);

        System.out.println("Original Employee Details");
        original.display();

        System.out.println();

        System.out.println("Cloned Employee Details");
        clone.display();
    }
}