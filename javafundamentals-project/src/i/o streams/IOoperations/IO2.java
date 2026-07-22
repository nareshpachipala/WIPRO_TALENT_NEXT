package IOoperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IO2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String outputFile = sc.nextLine();

        FileInputStream fis = new FileInputStream(
                "IOoperations-project/src/IOoperations/" + inputFile);

        FileOutputStream fos = new FileOutputStream(
                "IOoperations-project/src/IOoperations/" + outputFile);

        int ch;

        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }

        fis.close();
        fos.close();
        sc.close();

        System.out.println("File is copied.");
    }
}