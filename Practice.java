import java.util.Scanner;

public class Practice {
    /*
     * public static void main(String[] args) {
     * Scanner s = new Scanner(System.in);
     * int sum = 0;
     * int[] marks = new int[5];
     * for (int i = 0; i < 5; i++) {
     * System.out.println("Enter your marks in subject " + (i + 1) + ": ");
     * marks[i] = s.nextInt();
     * sum += marks[i];
     * }
     * double percentage = (double) sum / 500 * 100;
     * System.out.println("Your total marks are: " + sum);
     * System.out.println("Your percentage is: " + percentage + "%");
     * s.close();
     * }
     */
    /*
     * public static void main(String[] args)
     * {
     * System.out.println("Enter your name:");
     * Scanner s= new Scanner(System.in);
     * String a=s.nextLine();
     * System.out.println("Hello "+a+",Have a good day.");
     * s.close();
     * }
     */
    /*
     * public static void main(String[] args)
     * {
     * System.out.println("Enter your kilometer:");
     * Scanner s=new Scanner(System.in);
     * double km=s.nextDouble();
     * double mile=km*0.6213712;
     * System.out.println("Your enter Kilometer are "+km+" Corresponding miles are "
     * +mile);
     * s.close();
     * }
     */
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner s = new Scanner(System.in);
        boolean a = s.nextBoolean();
        boolean isint = a;
        if (isint) {
            System.out.println("Yes your enter number is integer.");
        } else {
            System.out.println("No your enter number is not integer.");
        }
        System.out.println(isint);
        s.close();
    }
}