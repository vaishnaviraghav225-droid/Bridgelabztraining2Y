package Array.Level1;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            if (number <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        System.out.println("Numbers entered:");

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Sum of all numbers = " + total);

        sc.close();
    }
}