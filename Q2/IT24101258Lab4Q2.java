import java.util.Scanner;

public class IT24101258Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input exam marks and lab submission marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = input.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = input.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        // Input percentages for exam and lab marks
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = input.nextDouble();
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = input.nextDouble();

        // Validate the percentages
        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        // Calculate final marks
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);
        System.out.printf("Final Exam Mark is : %.1f\n", finalMark);
    }
}