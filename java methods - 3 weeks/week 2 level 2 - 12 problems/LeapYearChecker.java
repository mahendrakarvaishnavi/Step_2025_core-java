import java.util.Scanner;

public class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year >= 1582) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                return true;
            } else {
                return false;
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        scanner.close();
    }
}
