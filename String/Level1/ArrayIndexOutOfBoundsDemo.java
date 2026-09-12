package String.Level1;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    public static void generateException(String[] names) {
        System.out.println(names[names.length + 1]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled successfully");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled successfully");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];

        System.out.println("Enter 5 names:");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        handleException(names);

        sc.close();
    }
}