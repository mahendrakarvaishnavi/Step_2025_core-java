import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return; // Exit the program if the input is not a valid natural number
        }

        int evenSize = number / 2 + 1;
        int oddSize = number / 2 + 1;
        
        int[] evenNumbers = new int[evenSize];
        int[] oddNumbers = new int[oddSize];
        
      
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) { // Even number
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else { // Odd number
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println(); 
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println(); 
  
        scanner.close();
    }
}
