import java.util.Scanner;

public class BMI_Calculator_2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numPersons = scanner.nextInt();

        double[][] personData = new double[numPersons][3]; 
        String[] weightStatus = new String[numPersons]; 

        for (int i = 0; i < numPersons; i++) {
            System.out.println("\nPerson " + (i + 1));

            double weight;
            do {
                System.out.print("Enter weight (kg): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (weight <= 0);  

            double height;
            do {
                System.out.print("Enter height (in meters): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (height <= 0); 
            personData[i][1] = weight;
            personData[i][0] = height;

            double bmi = weight / (height * height); 
            personData[i][2] = bmi;  

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }
        
        System.out.println("\nBMI Calculation Results:");
 
        System.out.println("Person | Height (m) | Weight (kg) | BMI    | Status");

        
        for (int i = 0; i < numPersons; i++) {
            System.out.printf("%-7d | %-11.2f | %-11.2f | %-6.2f | %s\n", 
                              (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
