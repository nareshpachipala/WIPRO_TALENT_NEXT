package IOoperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class IO3 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the input file name: ");
        String inputFile = sc.nextLine();

        System.out.print("Enter the output file name: ");
        String outputFile = sc.nextLine();

        File file = new File("IOoperations-project/src/IOoperations/" + inputFile);

        Scanner fileScanner = new Scanner(file);

        TreeMap<String, Integer> map = new TreeMap<>();

        while (fileScanner.hasNext()) {

            String word = fileScanner.next();

            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        fileScanner.close();

        PrintWriter pw = new PrintWriter(
                new FileWriter("IOoperations-project/src/IOoperations/" + outputFile));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            pw.println(entry.getKey() + " : " + entry.getValue());
        }

        pw.close();
        sc.close();

        System.out.println("Word count written to " + outputFile);
    }
}