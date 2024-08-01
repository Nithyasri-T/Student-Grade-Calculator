import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.println("Enter marks obtained in each subject (out of 100):");

        System.out.print("Mathematics: ");
        int mathMarks = scanner.nextInt();
        System.out.print("Science: ");
        int scienceMarks = scanner.nextInt();
        System.out.print("English: ");
        int englishMarks = scanner.nextInt();

        // Calculate total marks
        int totalMarks = mathMarks + scienceMarks + englishMarks;

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / 3;

        // Determine grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
