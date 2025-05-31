//************->*ANSWER 1*<-******************
/*import java.util.*;
public class Practice1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            for(int k=1;k<=l-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=b;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    sc.close();
    }
}*/
//*******************->*ANSWER 2*<-****************************
/*import java.util.*;
public class Practice1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(b+i-1+" ");
                
            }
            System.out.println();
        }

    sc.close();
    }
}*/
//*************************->ANWER 3*<-**************************
import java.util.*;
public class Practice1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=l;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print(b+i-1+" ");
                
            }
            System.out.println();
        }

    sc.close();
    }
}
