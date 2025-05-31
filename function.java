import java.util.*;
public class function
{
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter first number : ");
        Scanner s = new Scanner(System.in);
        int x=s.nextInt();
        System.out.println("Enter second number : ");
        int y=s.nextInt();
        System.out.println("The sum of the number is : "+sum(x,y));
        s.close();
    }
}