import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] ages = new int[10];

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
           
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                
                
                if (age < 0) {
                    System.out.println("Invalid age: " + age + ". Please enter a valid age.");
                } else if (age >= 18) {
                    System.out.println("The student with the age " + age + " can vote.");
                } else {
                    System.out.println("The student with the age " + age + " cannot vote.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid integer for age.");
                scanner.next(); 
            }
        }

        
        scanner.close();
    }
}
