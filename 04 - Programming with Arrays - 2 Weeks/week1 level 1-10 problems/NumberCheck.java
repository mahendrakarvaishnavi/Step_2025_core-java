import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is negative.");
            } else {
                System.out.println(num + " is zero.");
            }
        }

       
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first and last elements are equal: " + first + " == " + last);
        } else if (first > last) {
            System.out.println("The first element is greater than the last element: " + first + " > " + last);
        } else {
            System.out.println("The first element is less than the last element: " + first + " < " + last);
        }
          scanner.close();
    }
}
