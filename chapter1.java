import java.util.*;

public class chapter1 {
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static float CGP(int a, int b, int c) {
        if (a < 0 || a > 100 && b < 0 || b > 100 && c < 0 || c > 100) {
            System.out.println("Invalid maarks !!");
        }
        int total = a + b + c;
        int result = total / 3;
        return result;
    }

    public static double conveter(float kilometer) {
        double miles = (float) kilometer * 0.621371;
        return miles;
    }

    public static boolean isInteger(double a)
    {
       return a == Math.floor(a);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter the distance in kilometer : ");
        // float kilometer = s.nextFloat();
        // System.out.println("The corrosponding distance in miles is : " + conveter(kilometer));
        // System.out.print("Enter your name : ");
        // String name = s.nextLine();
        // System.out.println("Jai shri krishna "+name+" kem cho ?");
        // System.out.print("Enter the marks of three subject : ");
        // int a = s.nextInt();
        // int b = s.nextInt();
        // int c = s.nextInt();
        // System.out.println("Sum of three subject : "+CGP(a,b,c));
        // System.out.print("The sum of "+5+","+4+"&"+3+" is :"+sum(5,4,3));
        System.out.print("Enter a number : ");
        double a = s.nextDouble();
        System.out.println("Is the number integer : "+isInteger(a));;
        s.close();
    }
}