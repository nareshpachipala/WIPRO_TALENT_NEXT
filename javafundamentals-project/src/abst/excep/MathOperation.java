import java.util.Scanner;

public class MathOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        try {
            for (int i = 0; i < 5; i++) a[i] = Integer.parseInt(sc.nextLine());
            int sum = 0;
            for (int i : a) sum += i;
            System.out.println("Sum = " + sum);
            System.out.println("Average = " + (sum / 5));
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}
