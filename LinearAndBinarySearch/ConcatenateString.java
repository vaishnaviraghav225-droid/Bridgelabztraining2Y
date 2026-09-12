package LinearAndBinarySearch;


import java.util.Scanner;

public class ConcatenateString {

    static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String result = concatenateStrings(arr);

        System.out.println("Concatenated string: " + result);
    }
}

