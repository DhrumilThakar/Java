import java.util.*;
public class twodarray 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of row : ");
        int row = s.nextInt();
        System.out.print("Enter the length of column : ");
        int column = s.nextInt();
        int [][] arr = new int[row][column];
        System.out.println("Taking input");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)

            {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.print("Enter the number that you want to search :");
        int search = s.nextInt();
        System.out.println("Printing output");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
               // System.out.print(arr[i][j]+" "); for printing array
                if(arr[i][j]==search)
                {
                    System.out.println("The number found at : "+"( "+i+","+j+")");
                    continue;
                }
            }
            System.out.println();
        }
        s.close();
    }    
}
