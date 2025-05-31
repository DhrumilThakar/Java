import java.util.*;
public class StudentMarks{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to hold marks for 5 subjects
        int[] marks = new int[5];
        int totalMarks = 0;
        
        // Loop to get marks input for each subject and calculate the total
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        
        // Calculate average marks
        double averageMarks = (double) totalMarks / marks.length;
        
        // Display the results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        
        scanner.close();
    }
}