import java.util.Scanner;

public class practical_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input = true;

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);

        } 
        catch (Exception e) {
            input = false;
            System.out.println("You did not type an integer!");
        }
        System.out.println("Input correct: " + input);
        scanner.close();
    }
}
