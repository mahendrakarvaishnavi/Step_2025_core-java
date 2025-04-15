import java.util.Scanner;

public class AthleteRun {

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRounds(double perimeter) {
        double totalDistance = 5000; // 5 km in meters
        return (int) Math.ceil(totalDistance / perimeter); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();

        double perimeter = calculatePerimeter(side1, side2, side3);

        int rounds = calculateRounds(perimeter);

        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");

        scanner.close();
    }
}
