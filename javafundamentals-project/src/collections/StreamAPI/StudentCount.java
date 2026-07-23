

package StreamAPI;

import java.util.*;

public class StudentCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Student " + i);

            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Mark: ");
            int mark = sc.nextInt();

            list.add(new Student(roll, name, mark));
        }

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed = " + count);

        sc.close();
    }
}