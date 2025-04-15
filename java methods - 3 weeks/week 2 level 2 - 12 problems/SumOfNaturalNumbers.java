import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: Please enter a positive natural number.");
            scanner.close();
            return;
        }

        int sumRecursive = sumUsingRecursion(n);

        int sumFormula = sumUsingFormula(n);
        System.out.println("Sum of first " + n + " natural numbers using recursion: " + sumRecursive);
        System.out.println("Sum of first " + n + " natural numbers using the formula: " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("Both methods give the same result, the computation is correct.");
        } else {
            System.out.println("There is an error in the computation.");
        }
        scanner.close();
    }
}
