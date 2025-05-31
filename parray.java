import java.util.*;

public class parray {
    /*
     * public static void main(String[] args) {
     * Scanner s = new Scanner(System.in);
     * System.out.print("Sum of element of array");
     * float[] arr = new float[5];
     * for (int i = 0; i < 5; i++) {
     * arr[i] = s.nextFloat();
     * }
     * int sum = 0;
     * for (float i : arr) {
     * sum += i;
     * }
     * System.out.println(sum);
     * s.close();
     * }
     */
    /*
     * public static void main(String[]args)
     * {
     * System.out.print("Searchint of element ");
     * Scanner s=new Scanner(System.in);
     * System.out.print("Enter the size of the array ");
     * int size=s.nextInt();
     * int [] array = new int[size];
     * for(int i=0;i<size;i++)
     * {
     * System.out.print("Enter "+i+" element of the array : ");
     * array[i]=s.nextInt();
     * System.out.println();
     * }
     * System.out.print("Enter the number you have to search for : ");
     * int search=s.nextInt();
     * for(int i= 0;i<size;i++)
     * {
     * if(array[i]==search)
     * {
     * System.out.println("The number is found at "+i+" index of the array");
     * break;
     * }
     * 
     * }
     * s.close();
     * }
     */
    /*
     * public static void main(String[] args)
     * {
     * System.out.print("Avaerage in array ");
     * Scanner s = new Scanner(System.in);
     * System.out.print("Enter the number of student in the class : ");
     * int no_student=s.nextInt();
     * int [] marks = new int[no_student];
     * for(int i=0;i<no_student;i++)
     * {
     * System.out.print("Enter the marks of "+(i+1)+" student in physics : ");
     * marks[i]=s.nextInt();
     * System.out.println("");
     * }
     * int total = 0;
     * for(int i:marks)
     * {
     * total+=i;
     * }
     * System.out.println("The total of "+no_student+" is :"+total);
     * float average=total/no_student;
     * System.out.println("The average of class is : "+average);
     * s.close();
     * }
     */
    /*
     * public static void main(String[] args)
     * {
     * System.out.print("Sum of 2 array");
     * Scanner s = new Scanner(System.in);
     * int [][] arr1 = new int[2][3];
     * System.out.println("Enter the element of 1st matrice : ");
     * for(int i=0;i<2;i++)
     * {
     * for(int j=0;j<3;j++)
     * {
     * arr1[i][j]=s.nextInt();
     * }
     * }
     * System.out.println("Enter the element of 2nd matrice : ");
     * int[][]arr2 = new int[2][3];
     * for(int k=0;k<2;k++)
     * {
     * for(int l=0;l<3;l++)
     * {
     * arr2[k][l]=s.nextInt();
     * }
     * }
     * int[][]sum= new int[2][3];
     * for(int a=0;a<2;a++)
     * {
     * for(int b =0;b<3;b++)
     * {
     * sum[a][b]=arr1[a][b]+arr2[a][b];
     * }
     * }
     * for(int i=0;i<2;i++)
     * {
     * for(int j=0;j<3;j++)
     * {
     * System.out.print(sum[i][j]+" ");
     * }
     * System.out.println();
     * }
     * s.close();
     * 
     * }
     */
    /*
     * public static void main(String[] args)
     * {
     * System.out.println("To reverse the aaray !!");
     * Scanner s= new Scanner(System.in);
     * System.out.print("Enter the size of the array : ");
     * int size = s.nextInt();
     * int[]array=new int[size];
     * for(int i = 0;i<size;i++)
     * {
     * System.out.print("Enter the "+(i+1)+" element : ");
     * array[i]=s.nextInt();
     * }
     * System.out.println("The reverse order is ");
     * for(int i=size-1;i>=0;i--)
     * {
     * System.out.print(array[i]+" ");
     * }
     * s.close();
     * }
     */
    /*
     * public static void main(String[] args)
     * {
     * System.out.println("To find the greatest elemnt in the array !!");
     * Scanner s= new Scanner(System.in);
     * System.out.print("Enter the size of the array : ");
     * int size = s.nextInt();
     * int[] arr = new int[size];
     * for(int i = 0;i<size;i++)
     * {
     * System.out.println("Enter the "+(i+1)+" element : ");
     * arr[i]=s.nextInt();
     * }
     * int maximum_element=arr[0];
     * for(int i=0;i<size;i++)
     * {
     * if(arr[i]>maximum_element)
     * {
     * maximum_element=arr[i];
     * }
     * }
     * System.out.println("The gretest element of the array is : "+maximum_element);
     * s.close();
     * }
     */
    /*
     * public static void main(String[] args)
     * {
     * System.out.println("To find the smallest element in the array !!");
     * Scanner s = new Scanner(System.in);
     * System.out.print("Enter the size of the array : ");
     * int size = s.nextInt();
     * int [] arr = new int[size];
     * for(int i = 0;i<size;i++)
     * {
     * System.out.print("Enter the "+(i+1)+" element : ");
     * arr[i]=s.nextInt();
     * }
     * int minimum_element=arr[0];
     * for(int i=0;i<size;i++)
     * {
     * if(arr[i]<minimum_element)
     * {
     * minimum_element=arr[i];
     * }
     * }
     * System.out.println("The smallest element of the array is : "+minimum_element)
     * ;
     * s.close();
     * }
     */
    public static void main(String[] args) {
        System.out.println("To find wether the given array is shorted or not !!");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + (i + 1) + " element : ");
            arr[i] = s.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag++;
            }
        }
        if (flag > 0) {
            System.out.println("The given array is not sorted !!");
        } else {
            System.out.println("The given array is sorted !!");
        }
        s.close();
    }
}