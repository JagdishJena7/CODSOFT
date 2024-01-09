import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");

        System.out.print("Enter marks obtained in Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks obtained in Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks obtained in Subject 3: ");
        int subject3 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3;

        double averagePercentage = totalMarks / 3.0; 


        String grade = calculateGrade(averagePercentage);


        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    private static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else {
            return "Fail";
        }
    }
}
