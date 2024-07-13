import java.util.*;

public class StudentGradecal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of Subjects: ");
        int no_of_subject = sc.nextInt();
        int total_marks = 0;
        int[] subjarr = new int[no_of_subject];
        for (int i = 0; i < subjarr.length; i++) {
            System.out.print("Enter the marks of " + (i + 1) + " Subject: ");
            int markinput = sc.nextInt();
            total_marks += markinput;
        }
        double total_avg = (double) total_marks / no_of_subject;
        char grade = ' ';
        if (total_avg >= 90 && total_avg <= 100) {
            grade = 'A';
        } else if (total_avg >= 80 && total_avg <= 89) {
            grade = 'B';

        } else if (total_avg >= 70 && total_avg <= 79) {
            grade = 'C';
        } else if (total_avg >= 60 && total_avg <= 69) {
            grade = 'D';
        } else if (total_avg >= 50 && total_avg <= 59) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        if (grade >= 'A' && grade <= 'F') {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
        System.out.print("Total Marks           ");
        System.out.print("Average Percentage          ");
        System.out.println("Grade");
        System.out.print(total_marks + "                    ");
        System.out.print(total_avg + "                        ");
        System.out.println(grade + "  ");
    }
}