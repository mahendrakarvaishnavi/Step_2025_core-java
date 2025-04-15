import java.util.Scanner;

public class FootballTeamHeight {
    public static void main(String[] args) {
       
        double[] heights = new double[11];
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the heights of the 11 players in meters:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }

        double meanHeight = sum / 11;

        System.out.println("The mean height of the football team is: " + meanHeight + " meters");

        scanner.close();
    }
}
