import java.util.*;

public class arrays {
    Scanner s = new Scanner(System.in);

    public void update(int arr[])// here we pass array as a reference argument so it means that this value will
                                 // change the original array
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of array at index " + i + " : ");
            arr[i] = s.nextInt();
        }
    }

    public int linear(int arr[], int key)// linear search
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(i);
                break;
            }
        }
        return -1;
    }

    public int binary(int arr[], int key)// Binary search
    {
        int start = 0, end = Integer.MIN_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                System.out.println(mid);
                break;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public void subarray(int arr[])// subarry
    {
        int start, end;
        for (int i = 0; i < arr.length; i++) {
            start = i;
            for (int j = i; j < arr.length; j++) {
                end = j;
                for (int sub = start; sub <= end; sub++) {
                    System.out.print(arr[sub] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void largest(int arr[])// To find largest number in the array
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("The greatest number is : " + max);
    }

    public void smallest(int arr[])// To finnd smallest number in the array
    {
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.print("The smallest number is : " + small);
    }

    public void reverse(int arr[])// Reversing the array
    {
        int first = 0, last = arr.length - 1;
        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void pair(int arr[])// pair the adjecent element
    {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            temp = i;
            for (int j = i; j < arr.length; j++) {
                System.out.print("( " + temp + "," + arr[j] + " )");

            }
            System.out.println(" ");
        }
    }
//********************Kadane algorithm */
    public void kadane(int arr[])
    {
        int cur = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<arr.length;i++)
        {
            cur = cur + arr[i];
            if(cur < 0)
            {
                cur = 0;
            }
            max = Math.max(cur, max);
        }
        System.out.print("Our sum is : "+max);
    }
//****************************sub array sum
    public void sum(int arr[]) {
        int MAX_sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int current_sum = 0;
            for (int j = i; j < arr.length; j++) {
                current_sum += arr[j];
                if (current_sum > MAX_sum) {
                    MAX_sum = current_sum;
                }
            }
        }
        System.out.println(MAX_sum);
    }    
//*********************Prefix method */
    public void prefixs(int arr[]) {
        int MAX_sum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        
        // Compute the prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        // Compute the maximum sum of subarrays using the prefix sum array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int current_sum;
                if (i == 0) {
                    current_sum = prefix[j];  // Sum from the start of the array to j
                } else {
                    current_sum = prefix[j] - prefix[i-1];  // Sum from i to j
                }
                if (current_sum > MAX_sum) {
                    MAX_sum = current_sum;
                }
            }
        }
        
        System.out.println("Max sum is: " + MAX_sum);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrays a = new arrays();
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        // System.out.print("Original array is : ");
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // System.out.println(" ");
        // a.update(arr);
        // System.out.print("After updating the array is : ");
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        // System.out.println(" ");
        // System.out.print("Enter the number you want to search for : ");
        // int se = sc.nextInt();
        // a.linear(arr, se);
        // System.out.print("Enter the number you want to search (in binary) for : ");
        // int sea = sc.nextInt();
        // a.linear(arr, sea);
        // System.out.print("Subarray is : ");
        // a.subarray(arr);
        // a.largest(arr);
        // System.out.println(" ");
        // a.smallest(arr);
        // System.out.println(" ");
        // System.out.print("The reverse array is : ");
        // a.reverse(arr);
        // System.out.println("The pair in array are as follow : ");
        // a.pair(arr);
        //a.prefixs(arr);
        a.kadane(arr);
        sc.close();
    }
}
