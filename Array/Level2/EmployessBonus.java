package Array.Level2;

import java.util.Scanner;

public class EmployessBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        int index = 0;

        while (index < 10) {
            System.out.println("Enter details for Employee " + (index + 1));

            System.out.print("Enter salary: ");
            double sal = sc.nextDouble();

            System.out.print("Enter years of service: ");
            double yrs = sc.nextDouble();

            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input. Please enter again.");
                continue;
            }

            salary[index] = sal;
            years[index] = yrs;
            index++;
        }

        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}