
package Miniproject;

import java.util.ArrayList;

public class StringOperation6 {

    public ArrayList<String> operations(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        String result1 = s1.replace(s2, new StringBuilder(s2).reverse().toString());
        list.add(result1);

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last) {
            String result2 = s1.substring(0, last)
                    + new StringBuilder(s2).reverse()
                    + s1.substring(last + s2.length());
            list.add(result2);
        } else {
            list.add(s1 + s2);
        }

        // Operation 3
        if (first != last) {
            String result3 = s1.substring(0, first)
                    + s1.substring(first + s2.length());
            list.add(result3);
        } else {
            list.add(s1);
        }

        // Operation 4
        int n = s2.length();
        int mid = (n % 2 == 0) ? n / 2 : (n / 2) + 1;

        String result4 = s2.substring(0, mid) + s1 + s2.substring(mid);
        list.add(result4);

        // Operation 5
        String result5 = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) != -1)
                result5 += "*";
            else
                result5 += s1.charAt(i);
        }
        list.add(result5);

        return list;
    }
}