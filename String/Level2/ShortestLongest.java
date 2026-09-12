package String.Level2;

import java.util.Scanner;

public class ShortestLongest {

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

        String[] words = new String[wordCount];
        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);

            if (ch == ' ') {
                words[wordIndex] = word;
                wordIndex++;
                word = "";
            } else {
                word = word + ch;
            }
        }

        words[wordIndex] = word;

        return words;
    }

    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static int[] findShortestLongest(String[][] words) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < words.length; i++) {
            int currentLength = Integer.parseInt(words[i][1]);
            int shortestLength = Integer.parseInt(words[shortestIndex][1]);
            int longestLength = Integer.parseInt(words[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[] {shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] wordsWithLength = getWordsWithLength(words);

        int[] result = findShortestLongest(wordsWithLength);

        int shortestIndex = result[0];
        int longestIndex = result[1];

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < wordsWithLength.length; i++) {
            int length = Integer.parseInt(wordsWithLength[i][1]);
            System.out.println(wordsWithLength[i][0] + "\t" + length);
        }

        System.out.println("\nShortest String: "
                + wordsWithLength[shortestIndex][0]);

        System.out.println("Longest String: "
                + wordsWithLength[longestIndex][0]);

        sc.close();
    }
}