package String.Level2;

import java.util.Scanner;

public class RockPaperScissors {
    // Method to find computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper"))) {
            return "Player";
        }

        return "Computer";
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int games) {

        String[][] stats = new String[2][3];

        double playerPercentage = (playerWins * 100.0) / games;
        double computerPercentage = (computerWins * 100.0) / games;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercentage);

        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {

        System.out.println("\nGame Results");
        System.out.println("------------------------------------------------");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.println(
                    results[i][0] + "\t" +
                            results[i][1] + "\t" +
                            results[i][2] + "\t\t" +
                            results[i][3]
            );
        }

        System.out.println("\nWin Statistics");
        System.out.println("--------------------------------");
        System.out.println("Player\tWins\tWinning Percentage");
        System.out.println("--------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                    stats[i][0] + "\t" +
                            stats[i][1] + "\t" +
                            stats[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        String[][] results = new String[games][4];

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.println("\nGame " + (i + 1));
            System.out.print("Enter Rock, Paper or Scissors: ");
            String user = sc.next();

            user = user.substring(0, 1).toUpperCase()
                    + user.substring(1).toLowerCase();

            String computer = getComputerChoice();

            String winner = findWinner(user, computer);

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            results[i][0] = String.valueOf(i + 1);
            results[i][1] = user;
            results[i][2] = computer;
            results[i][3] = winner;
        }

        String[][] stats = calculateStats(
                playerWins, computerWins, games);

        displayResults(results, stats);

        sc.close();
    }
}