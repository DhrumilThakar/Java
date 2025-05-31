import java.util.*;
public class condition 
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        
       /*  System.out.println("a:"+a+" "+"n:"+n);
        if (n>a)
         {
          System.out.print("N is greater than a");  
         }
         else if(n==a)
         {
            System.out.println("Both are Equal");
         }
         else
         {
           System.out.println("a is greater than n");
         }
         */
System.out.println("Enter number to perform task:");
int n=sc.nextInt();
switch (n) {
  case 1:System.out.println("Hello");
    
    break;
case 2: System.out.println("Namaste");
break;
case 3: System.out.println("Bc");
break;
  default:System.out.println("Enter a valid number");
    break;
}
        sc.close();

    }
}
