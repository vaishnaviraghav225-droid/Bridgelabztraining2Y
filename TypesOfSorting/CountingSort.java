package TypesOfSorting;

import java.util.Scanner;

public class CountingSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        int[] count = new int[9];


        for (int i = 0; i < n; i++) {
            count[ages[i] - 10]++;
        }


        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }


        int[] output = new int[n];

        // Place elements in correct positions
        for (int i = n - 1; i >= 0; i--) {
            output[count[ages[i] - 10] - 1] = ages[i];
            count[ages[i] - 10]--;
        }

        System.out.println("Student ages in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(output[i] + " ");
        }
    }
}

