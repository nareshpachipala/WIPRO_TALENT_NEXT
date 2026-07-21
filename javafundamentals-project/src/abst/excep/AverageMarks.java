import java.util.Scanner;

class NegativeMarksException extends Exception {
    NegativeMarksException(String m) { super(m); }
}

class MarksOutOfRangeException extends Exception {
    MarksOutOfRangeException(String m) { super(m); }
}

public class AverageMarks {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter name");
            String name = sc.nextLine();
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter mark " + (j + 1));
                int m = Integer.parseInt(sc.nextLine());
                if (m < 0) throw new NegativeMarksException("Negative marks not allowed");
                if (m > 100) throw new MarksOutOfRangeException("Marks should be between 0 and 100");
                sum += m;
            }
            System.out.println(name + " average = " + (sum / 3));
        }
    }
}
