package Array.Level2;

import java.util.Scanner;

public class StudentGrade {
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

            percentage[index] = (physics + chemistry + maths) / 3;

            if (percentage[index] >= 80) {
                grade[index] = 'A';
            } else if (percentage[index] >= 70) {
                grade[index] = 'B';
            } else if (percentage[index] >= 60) {
                grade[index] = 'C';
            } else if (percentage[index] >= 50) {
                grade[index] = 'D';
            } else if (percentage[index] >= 40) {
                grade[index] = 'E';
            } else {
                grade[index] = 'R';
            }

            index++;
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