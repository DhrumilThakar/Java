import java.util.*;
class BigExcaption extends Exception
{
    BigExcaption(String sc)
    {
        super(sc);
    }
}
class SmallExcaption extends Exception
{
    SmallExcaption(String sc)
    {
        super(sc);
    }
}
public class OwnExcaption
{
    public void printErrorReport(Exception e)
    {
        System.out.println("Error Report : "+e.getMessage());
    }
    public void testValue(int num) throws SmallExcaption , BigExcaption
    {
        if(num<5)
        {
            throw new SmallExcaption("Value is less than 5 !!");
        }
        else if(num>10)
        {
            throw new BigExcaption("Value is greater than 10 !!");
        }
        else
        {
            System.out.println("Value is ok : "+num);
        }
    }
    public static void main(String[] args) 
    {
        OwnExcaption o = new OwnExcaption();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i = 0;i<size;i++)
        {
            System.out.print("Enter "+(i+1)+" element : ");
            arr[i] = s.nextInt();
        }
        for(int i : arr)
        {
            try
            {
                o.testValue(i);
            }
            catch (SmallExcaption | BigExcaption e) 
            {
                o.printErrorReport(e);
            }
    }
    s.close();
}
}