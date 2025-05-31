import java.util.*;
public class mini_calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose a operation to be perform :\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modlu");
        int choice=sc.nextInt();
        switch (choice) {
            case 1:{
                System.out.println("Addition:"+(a+b));
            }
                
                break;
                case 2:{
                    System.out.println("Substraction:"+(a-b));
                }
                
                break;
                case 3:{
                    System.out.println("Multiplication:"+(a*b));
                }
                
                break;
                case 4:{
                    if(b==0)
                    {
                        System.out.println("can't divid by zero");
                    }
                    System.out.println("Division:"+(a/b));
                }
                
                break;
                case 5:{
                    if(b==0)
                    {
                        System.out.println("can't divid by zero");
                    }
                    System.out.println("Modulo:"+(a%b));
                }
                break;
                default:System.out.println("Enter a valid number");
                
        }
        sc.close();
    }
}
