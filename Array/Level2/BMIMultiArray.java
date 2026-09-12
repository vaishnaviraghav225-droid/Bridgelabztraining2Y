package Array.Level2;

import java.util.Scanner;

public class BMIMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            do {
                System.out.print("Enter weight in kg: ");
                personData[i][0] = sc.nextDouble();

                if (personData[i][0] <= 0) {
                    System.out.println("Invalid weight. Enter a positive value.");
                }
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height in meters: ");
                personData[i][1] = sc.nextDouble();

                if (personData[i][1] <= 0) {
                    System.out.println("Invalid height. Enter a positive value.");
                }
            } while (personData[i][1] <= 0);

            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nWeight\tHeight\tBMI\tStatus");

        for (int i = 0; i < number; i++) {
            System.out.println(
                    personData[i][0] + "\t" +
                            personData[i][1] + "\t" +
                            String.format("%.2f", personData[i][2]) + "\t" +
                            weightStatus[i]
            );
        }

        sc.close();
    }
}