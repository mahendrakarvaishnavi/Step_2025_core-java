import java.util.Scanner;

public class StudentGradeCalculator2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3];  
        double[] percentages = new double[numStudents];  
        String[] grades = new String[numStudents];  

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int mark;
                do {
                    System.out.print("Enter marks for " + subject + " (0-100): ");
                    mark = scanner.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid marks! Marks must be between 0 and 100. Please enter again.");
                    }
                } while (mark < 0 || mark > 100);  
                marks[i][j] = mark;  
            }

            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];  
            percentages[i] = (totalMarks / 300) * 100;  

            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 75) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "D";
            }
        }

        System.out.println("\nStudent Results:");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-8d | %-7d | %-9d | %-5d | %-10.2f | %s\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
}
