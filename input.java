import java.util.*;  //To take input from user
class input {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);    //-->Scanner ane system ma s capital
        int a=sc.nextInt();    //int ma I capital
        int b = sc.nextInt();
        int sum=a+b;    
        System.out.print(sum);
        sc.close();
    }
}