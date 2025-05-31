import java.util.*;
public class control_Statement 
{
    //*****Answer 1 **********/
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number for loop : ");
        int n = s.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
//********Answer 2 ****************/
    /*public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = s.nextInt();
        int i=0;
        int flag=0;
        while (i<=n) 
        {
            if(i%2==0)
            {
              flag+=i;  
            }
           i++; 
        }
        System.out.println(flag);
    }*/
    /*public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to print the table : ");
        int n=s.nextInt();
        for(int i=1;i<=100;i++)
        {
            System.out.println(n+" x "+1+" = "+(n*i));
        }
        s.close();
    }*/
   /*public static void main(String[] args)
    {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter the number to be print reverse table : ");
        int n  = s.nextInt();
        for(int i=10;i>0;i--)
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        s.close();
    }*/
/*public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to find factorial : ");
        int n=s.nextInt();
        int result=1;
        for(int i=1;i<=n;i++)
        {
            result*=i;
        }
        System.out.println(result);
        s.close();
    }*/
    /*public static void main(String args[])
    {
        while(5!=0)
        {
            System.out.print("5");
        }
    }*/
}
