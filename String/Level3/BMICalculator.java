package String.Level3;

import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {

        double heightMeter = heightCm / 100;

        double bmi = weight / (heightMeter * heightMeter);

        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;

        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] {
                String.valueOf(weight),
                String.valueOf(heightCm),
                String.valueOf(bmi),
                status
        };
    }

    public static String[][] processBMI(double[][] persons) {

        String[][] result = new String[persons.length][4];

        for (int i = 0; i < persons.length; i++) {

            String[] bmiResult = calculateBMI(
                    persons[i][0],
                    persons[i][1]
            );

            result[i][0] = bmiResult[0];
            result[i][1] = bmiResult[1];
            result[i][2] = bmiResult[2];
            result[i][3] = bmiResult[3];
        }

        return result;
    }

    public static void displayResult(String[][] result) {

        System.out.println("\nBMI Report");
        System.out.println(
                "------------------------------------------------------------"
        );

        System.out.printf(
                "%-10s %-12s %-10s %-15s%n",
                "Weight", "Height(cm)", "BMI", "Status"
        );

        System.out.println(
                "------------------------------------------------------------"
        );

        for (int i = 0; i < result.length; i++) {

            System.out.printf(
                    "%-10s %-12s %-10s %-15s%n",
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    result[i][3]
            );
        }

        System.out.println(
                "------------------------------------------------------------"
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.print("Enter weight in kg: ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height in cm: ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] result = processBMI(persons);

        displayResult(result);

        sc.close();
    }
}