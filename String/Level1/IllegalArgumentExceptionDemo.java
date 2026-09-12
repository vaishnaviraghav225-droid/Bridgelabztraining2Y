package String.Level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled successfully");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled successfully");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        handleException(text);

        sc.close();
    }
}