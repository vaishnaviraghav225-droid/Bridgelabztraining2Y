package String.Level1;

import java.util.Scanner;

public class StringCharacters {

    public static char[] getCharacters(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] userDefined = getCharacters(str);
        char[] builtIn = str.toCharArray();

        System.out.print("Characters using user-defined method: ");
        for (char ch : userDefined) {
            System.out.print(ch + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char ch : builtIn) {
            System.out.print(ch + " ");
        }

        System.out.println();

        boolean result = compareArrays(userDefined, builtIn);

        System.out.println("Both character arrays are equal: " + result);

        sc.close();
    }
}