import java.util.*;

public class method {
    /*
     * static void pattern(int n)
     * {
     * for(int i=1;i<=n;i++)
     * {
     * for(int j=1;j<=i;j++)
     * {
     * System.out.print("*"+" ");
     * }
     * System.out.println();
     * }
     * }
     * public static void main(String[] args)
     * {
     * Scanner sc=new Scanner(System.in);
     * System.out.println("Enter the number of rows");
     * int n=sc.nextInt();
     * pattern(n);
     * sc.close();
     * }
     */
    /*
     * static int recurisive(int i)
     * {
     * if(i==0||i==1)
     * {
     * return 1;
     * }
     * else
     * {
     * return i+recurisive(i-1);
     * }
     * }
     * public static void main(String[] args) {
     * Scanner s=new Scanner(System.in);
     * System.out.println("Enter the number : ");
     * int n=s.nextInt();
     * System.out.println(recurisive(n));
     * s.close();
     * }
     */
    /*
     * static void pattern(int n)
     * {
     * for(int i=n;i>=0;i--)
     * {
     * for(int j=i;j>=1;j--)
     * {
     * System.out.print("*"+" ");
     * }
     * System.out.println();
     * }
     * }
     * public static void main(String[] args)
     * {
     * Scanner sc=new Scanner(System.in);
     * System.out.println("Enter the number");
     * int n=sc.nextInt();
     * pattern(n);
     * sc.close();
     * }
     */
    static int fibonacci(int i) {
        if (i == 0 || i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);// 0112358,13,........
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}