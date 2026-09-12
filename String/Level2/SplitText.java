package String.Level2;

import java.util.Scanner;

public class SplitText {

    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitWords(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];

            String word = "";

            for (int j = start; j < end; j++) {
                word = word + text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        String word = "";

        for (int i = start; i < length; i++) {
            word = word + text.charAt(i);
        }

        words[wordCount - 1] = word;

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] userDefined = splitWords(text);

        String[] builtIn = text.split(" ");

        System.out.println("\nWords using user-defined method:");
        for (String word : userDefined) {
            System.out.println(word);
        }

        System.out.println("\nWords using split() method:");
        for (String word : builtIn) {
            System.out.println(word);
        }

        boolean result = compareArrays(userDefined, builtIn);

        System.out.println("\nBoth results are equal: " + result);

        sc.close();
    }
}