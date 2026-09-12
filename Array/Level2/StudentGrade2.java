package Array.Level2;

import java.util.Scanner;

public class StudentGrade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        int index = 0;

        while (index < number) {
            System.out.println("\nStudent " + (index + 1));

            System.out.print("Enter Physics marks: ");
            double physics = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            double chemistry = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            double maths = sc.nextDouble();

            if (physics < 0 || chemistry < 0 || maths < 0) {
                System.out.println("Invalid marks. Please enter positive values.");
                continue;
            }

            marks[index][0] = physics;
            marks[index][1] = chemistry;
            marks[index][2] = maths;

            index++;
        }

        for (int i = 0; i < number; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';
            }
        }

        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");

        for (int i = 0; i < number; i++) {
            System.out.println(
                    marks[i][0] + "\t" +
                            marks[i][1] + "\t\t" +
                            marks[i][2] + "\t" +
                            String.format("%.2f", percentage[i]) + "%\t\t" +
                            grade[i]
            );
        }

        sc.close();
    }
}