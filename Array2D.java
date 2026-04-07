/*data_type[][] array_name = new data_type[x][y];

array_name[row_index][col_index] = value;*/

//While Declaring a 2D array the mandatory part is to initialize the row we may or may not initialize column

//As each 2D array is a arrays of 1D arrays

//Rest is writen in book
import java.util.*;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        int[][] arr1 = new int[3][];

        int[][] arr2 = {{1,2,3},{4,5},{6,7,8,9}};

        for(int i =0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
            // System.out.println(arr2[1][3]);
        }

        System.out.println(arr1.length); //This will print the size of the row
        

        System.out.println(Arrays.deepToString(inputArray()));

    }

    public static int[][] inputArray(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The numbers of Row");
        int row = s.nextInt();
        System.out.println("Enter The numbers of Column");
        int column = s.nextInt();

        int[][] arr = new int[row][column];

        System.out.print("Enter The Elements of the Array: ");

        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                arr[i][j]=s.nextInt();
            }
            System.out.println();
        }
        s.close();

        return arr;
    }
}