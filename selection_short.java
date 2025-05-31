import java.util.*;
public class selection_short 
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int size = s.nextInt();
        int [] arr = new int[size];
        System.out.println("Entering the element of the array  ! ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("The array before shorting  is :");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        for(int i =0;i<arr.length-1;i++)
        {
            int small=i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;
                }
            }
            int temp = arr[small];
                    arr[small] = arr[i];
                    arr[i] = temp;
        }
        System.out.println(" ");
        System.out.println("The array after shorting  is :");
        for(int i : arr)
        {
            System.out.print(i+" ");
        }
        s.close();
    }
}