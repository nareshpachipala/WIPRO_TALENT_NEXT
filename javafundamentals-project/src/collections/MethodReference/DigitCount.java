package MethodReference;

public class DigitCount {

    public static int digitCount(int n) {

        n = Math.abs(n);

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }
}
