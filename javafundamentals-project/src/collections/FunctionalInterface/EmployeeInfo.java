package FunctionalInterface;

public class EmployeeInfo {

    private int id;
    private String name;
    private String location;
    private double salary;

    public EmployeeInfo(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
