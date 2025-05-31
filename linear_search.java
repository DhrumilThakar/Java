import java.util.*;
public class linear_search
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size_of = s.nextInt();
        int array[] = new int[size_of];
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<size_of;i++)
        {
            array[i] = s.nextInt();
        }
        System.out.println("Enter the number ryou have to searc for : ");
        int search = s.nextInt();
        for(int i=0;i<size_of;i++)
        {
            if(array[i]==search)
            {
                System.out.println("The number is found at index : "+i);
            }
        }
        s.close();
    }    
}
