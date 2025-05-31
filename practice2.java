import java.util.*;
public class practice2 
{public static void main(String[] args)
    {
        System.out.println("***Answer 1***");
        float a=7/4*9/2;
        System.out.println(a);
        System.out.println("***Answer 2***");
        System.out.println("Encryption");
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        System.out.println("The number become : "+(b+8));
        System.out.println("After decryption number is : "+(b+8-8));
        System.out.println("***Answer 3***");
        System.out.println("Enter a number : ");
        int c = s.nextInt();
        if(c>10)
        {
            System.out.println("The enter number is greater than 10 ");
        }
        else if(c<10)
        {
            System.out.println("The enter number is not greater than 10");
        }
        else if(c==10)
        {
            System.out.println("The enter number is equal to 10");
        }
        else if(c!=10)
        {
            System.out.println("The enter number is not equal to 10");
        }
        s.close();
    }   
}