package codsoft;

 import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSubjects = 5;
        int maxScore = 100;
        
        System.out.println("Student Grade Calculator");
        System.out.println("Enter scores for 5 subjects (out of 100):");

        int totalScore = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter score for Subject " + i + ": ");
            int score = scanner.nextInt();
            
            if (score < 0 || score > maxScore) {
                System.out.println("Invalid score. Scores should be between 0 and 100.");
                return;
            }
            
            totalScore += score;
        }

        double averageScore = (double) totalScore / numSubjects;

        System.out.println("Total Score: " + totalScore);
        System.out.println("Average Score: " + averageScore);

        char grade = calculateGrade(averageScore);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static char calculateGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

}
    

