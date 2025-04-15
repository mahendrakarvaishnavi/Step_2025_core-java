import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[] weights = new double[numPersons];
        double[] heights = new double[numPersons];
        double[] bmiValues = new double[numPersons];
        String[] weightStatuses = new String[numPersons];

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight (kg): ");
            weights[i] = scanner.nextDouble();
            
            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();

            bmiValues[i] = weights[i] / (heights[i] * heights[i]);

            if (bmiValues[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmiValues[i] < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmiValues[i] < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obesity";
            }
        }
        
        System.out.println("\nBMI Calculation Results:");
        System.out.println("Person | Height (m) | Weight (kg) | BMI    | Status");
        
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-7d | %-11.2f | %-11.2f | %-6.2f | %s\n", 
                              (i + 1), heights[i], weights[i], bmiValues[i], weightStatuses[i]);
        }
        
       
        scanner.close();
    }
}
