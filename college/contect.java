import java.util.Scanner;
public class contect 
{
    public static void main(String[] args)
    {System.out.println("Enter number in the form +91-AA-BBB-CCCCC");
        Scanner s = new Scanner(System.in);
        String mobile=s.nextLine();
        String[] parts=mobile.split("-");
        String System1=parts[1];
        String MSC=parts[2];
        String Unique=parts[3];
        System.out.println("Mobile system operator code is "+System1);
        System.out.println("MSC code is "+MSC);
        System.out.println("Unique code "+Unique);
        s.close();

    }    
}

