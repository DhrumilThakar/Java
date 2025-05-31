/*class add
{
    public static void main(String[] args)
    {
int num1=1;
int num2=2;
int num3=3;
int sum=num1+num2+num3;
System.out.println(sum);
    }
}*/
// by taking input from user
import java.util.*;
public class add
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Sum of"+" "+a+" "+"and"+" "+b+" "+"is:"+" "+(a+b));
        sc.close();
    }
}
