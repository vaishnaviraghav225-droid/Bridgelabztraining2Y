package String.Level3;

import java.util.Scanner;

public class PalindromeCheck {

    public static boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    public static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        return reverse;
    }

    public static boolean checkPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        boolean result1 = checkPalindrome(text);
        boolean result2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = checkPalindromeUsingArray(text);

        System.out.println("\nLogic 1 (Using Loop): " + result1);
        System.out.println("Logic 2 (Using Recursion): " + result2);
        System.out.println("Logic 3 (Using Character Array): " + result3);

        if (result1 && result2 && result3) {
            System.out.println("The text is a Palindrome.");
        } else {
            System.out.println("The text is NOT a Palindrome.");
        }

        sc.close();
    }
}
