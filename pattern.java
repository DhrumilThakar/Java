/*public class pattern
{
    public static void main(String[] args)
    {
        for(int i=0;i<=108;i++)
        {
            System.out.println(i+"."+" "+"JAI SHREE RAM");
        }
    }
}*/
/*import java.util.*;
public class pattern 
{
 public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i-1;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}
sc.close();
 }   
}*/
//*********************Rectangle ''*'' Pattern **************************
/*import java.util.*;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        for(int i =1; i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
            System.out.print("* ");
            } 
            System.out.println();
        }
        sc.close();
    }
}*/
//***************************SQUAR PATTERN*************************
/*import java.util.*;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
            System.out.print("* ");
            } 
            System.out.println();
        }
        sc.close();
    }
}*/
//********************HOLO RECTANGLE*****************************
/*import java.util.*;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        for(int i =1; i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if (i==1 || j==1 || i==n || j==m) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            
            } 
            System.out.println();
        }
        sc.close();
    }
}*/
//**********************HOLO SQUARE****************
/*import java.util.*;
public class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if (i==1 || j==1 || i==n || j==n) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            
            } 
            System.out.println();
        }
        sc.close();
    }
}*/
//********************INVERT HALF PYRAMID************************
/*import java.util.*;
public class pattern 
{
 public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=n;i>=1;i--) //->i ne n thi lai ne decrese kar vanu
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}
sc.close();
 }   
}*/
//*************************MIDDLE PYRAMID*****************************
/*import java.util.*;
public class pattern 
{
 public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
    for(int k=1;k<=n-i;k++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("* ");
    }
    System.out.println();
}
sc.close();
 }   
}*/
//**************************RIGHT PYRAMID****************************
/*import java.util.*;
public class pattern 
{
 public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
    for(int k=1;k<=n-i;k++)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
sc.close();
 }   
}*/
//*************************NUMBER PYRAMID**************************
/*import java.util.*;
public class pattern 
{
 public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}
sc.close();
 }   
}*/
//**********************INVERT NUMBER PYRAMID*****************************
/*import java.util.*;
public class pattern 
{
 public static void main(String[] args)
 {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=n;i>=1;i--)
{
    for(int j=1;j<=i;j++)
    {
        System.out.print(j+" ");
    }
    System.out.println();
}
sc.close();
 }   
}
//******2nd Method for same problem*************
import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/
//********************FLOYD'S TRIANGLE*************************
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
        sc.close();
    }
}*/
//*********************0-1 PATTERN*********************
/*import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) 
            {
                if((i+j)%2==0)
                {
                    System.out.print(1+" ");
                }
               else
               {
                System.out.print(0+" ");
               } 
            }
            System.out.println();
        }
        sc.close();
    }
}*/
