import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        
        int[] digits = new int[count];
        
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;  
            temp /= 10; 
        }

        int[] reversedDigits = new int[count];

        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[i];
        }
 
        System.out.print("The number in reverse order is: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }

        scanner.close();
    }
}
