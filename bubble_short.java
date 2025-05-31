import java.util.*;
public class bubble_short 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = s.nextInt();
        int [] array = new int[size];
        System.out.println("Taking the element for the array !");
        for(int i = 0;i<array.length;i++)
        {
            System.out.print("Enter the "+i+" element of the array : ");
            array[i] = s.nextInt();
        }
        System.out.println("The array before shorting is : ");
        for(int i:array )
        {
            System.out.print(i+" ");
        }
        //using two for loops 
       /*for(int i = 0;i<array.length;i++)
        {
            for(int j = i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }*/
        //using while loop 
        int count=1;
        while(count<array.length)
        {
            for(int i = 0;i<array.length-count;i++)
            {
                if(array[i]>array[i+1])
                {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
            count++;
        }
        System.out.println(" ");
System.out.println("After shorting the array is : ");
for(int i:array )
{
    System.out.print(i+" ");
}
s.close();
    }
}