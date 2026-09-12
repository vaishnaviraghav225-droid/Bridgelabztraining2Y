package String.Level2;

import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];

        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 90) + 10; // Physics
            scores[i][1] = (int) (Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int) (Math.random() * 90) + 10; // Maths
        }

        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];

        for (int i = 0; i < scores.length; i++) {

            double total = scores[i][0] + scores[i][1] + scores[i][2];

            double average = total / 3.0;

            double percentage = (total / 300.0) * 100;

            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }

        return results;
    }

    public static String[][] calculateGrade(double[][] results) {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {

            double percentage = results[i][2];

            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }

        return grades;
    }

    public static void displayScorecard(
            int[][] scores,
            double[][] results,
            String[][] grades) {

        System.out.println("\nStudent Scorecard");
        System.out.println(
                "--------------------------------------------------------------------------"
        );

        System.out.printf(
                "%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "Student", "Physics", "Chemistry", "Maths",
                "Total", "Average", "Percentage", "Grade"
        );

        System.out.println(
                "--------------------------------------------------------------------------"
        );

        for (int i = 0; i < scores.length; i++) {

            System.out.printf(
                    "%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10s%n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i][0]
            );
        }

        System.out.println(
                "--------------------------------------------------------------------------"
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);

        double[][] results = calculateResults(scores);

        String[][] grades = calculateGrade(results);

        displayScorecard(scores, results, grades);

        sc.close();
    }
}