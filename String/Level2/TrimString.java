package String.Level2;

import java.util.Scanner;

public class TrimString {

    public static int[] findTrimPoints(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] {start, end};
    }

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        int[] points = findTrimPoints(text);

        String userDefinedTrim = createSubstring(
                text, points[0], points[1]);

        String builtInTrim = text.trim();

        System.out.println("\nString using user-defined method: ["
                + userDefinedTrim + "]");

        System.out.println("String using trim(): ["
                + builtInTrim + "]");

        boolean result = compareStrings(
                userDefinedTrim, builtInTrim);

        System.out.println("\nBoth strings are equal: " + result);

        sc.close();
    }
}