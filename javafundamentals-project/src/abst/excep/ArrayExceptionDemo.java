import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array");
            int n = Integer.parseInt(sc.nextLine());
            int[] a = new int[n];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the index of the array element you want to access");
            int idx = Integer.parseInt(sc.nextLine());
            System.out.println("The array element at index " + idx + " = " + a[idx]);
            System.out.println("The array element successfully accessed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
