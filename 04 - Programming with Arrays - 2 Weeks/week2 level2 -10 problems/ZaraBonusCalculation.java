import java.util.Scanner;

public class ZaraBonusCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        final int NUM_EMPLOYEES = 10;

        double[] oldSalary = new double[NUM_EMPLOYEES];
        int[] yearsOfService = new int[NUM_EMPLOYEES];
 
        double[] bonus = new double[NUM_EMPLOYEES];
        double[] newSalary = new double[NUM_EMPLOYEES];
  
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            while (true) {
                System.out.println("Enter details for employee " + (i + 1) + ":");

                System.out.print("Enter years of service: ");
                int years = scanner.nextInt();

                System.out.print("Enter old salary: ");
                double salary = scanner.nextDouble();

                if (years <= 0 || salary <= 0) {
                    System.out.println("Invalid input! Years of service and salary must be positive numbers.");
                    continue; 
                }
  
                yearsOfService[i] = years;
                oldSalary[i] = salary;
                break; 
            }
        }

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            
            if (yearsOfService[i] > 5) {
                bonus[i] = oldSalary[i] * 0.05; 
            } else {
                bonus[i] = oldSalary[i] * 0.02; 
            }

            newSalary[i] = oldSalary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal bonus payout: " + totalBonus);
        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total new salary of all employees: " + totalNewSalary);

        scanner.close();
    }
}
