package LinearAndBinarySearch;


import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicate{

    static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeDuplicates(str);

        System.out.println("String without duplicates: " + result);
    }
}
