public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Naresh", 500000, 2024, "INS123");
        e.setName("Naresh Kumar");
        e.setAnnualSalary(550000);
        e.setYearStarted(2023);
        e.setNationalInsuranceNumber("INS456");

        System.out.println(e.getName());
        System.out.println(e.getAnnualSalary());
        System.out.println(e.getYearStarted());
        System.out.println(e.getNationalInsuranceNumber());
    }
}
