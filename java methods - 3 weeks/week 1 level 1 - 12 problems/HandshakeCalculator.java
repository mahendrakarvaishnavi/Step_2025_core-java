import java.util.Scanner;

public class HandshakeCalculator {

    public static int maxHandshakes(int numberOfStudents) {
        
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        
        int handshakes = maxHandshakes(numberOfStudents);

        
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is: " + handshakes);

       
        scanner.close();
    }
}
