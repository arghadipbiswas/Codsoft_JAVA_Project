import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numOfSubjects = scanner.nextInt();

        int totalMarks = 0;
        double Percentage;

        System.out.println("Enter marks obtained (out of 100) for each subject:");
        for (int i = 1; i <= numOfSubjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        Percentage = (double) totalMarks / numOfSubjects;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + Percentage);

        char grade = calculateGrade(Percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(double Percentage) {
        if (Percentage >= 90) {
            return 'A';
        } else if (Percentage >= 80) {
            return 'B';
        } else if (Percentage >= 70) {
            return 'C';
        } else if (Percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
