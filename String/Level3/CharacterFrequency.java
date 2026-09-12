package String.Level3;

import java.util.Scanner;

public class CharacterFrequency {

    public static String[][] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        int count = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }

        String[][] result = new String[count][2];

        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            boolean found = false;

            for (int j = 0; j < index; j++) {
                if (result[j][0].charAt(0) == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" + result[i][1]
            );
        }

        sc.close();
    }
}