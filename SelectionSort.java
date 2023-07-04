import java.util.Scanner;

public class SelectionSort {
    static int minIndex =0;

    static long getMin(long[] arr1, int j)            // method for getting minimum element of the Array
    {

        long min = arr1[j];
        
        for (int i=j ; i < (arr1.length); i++)
        {
            if (arr1[i] < min)
            {
                min = arr1[i];
                minIndex = i;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int n = sc.nextInt()  ;
        long  temp ;                            // temporary variable for Swapping the array elements

        long[] arr = new long[n];
        System.out.println("Enter "+n+" Elements for the Array");
        for (int i=0; i<n ; i++)                   //enter the values to the array
        {
            arr[i] = sc.nextInt();
        }

        for (int i=0; i < n-1; i++)               // swapping the min value at the designated place
        {
           temp = getMin(arr,i);
           arr[minIndex] = arr[i];
           arr[i] = temp;
        }

        for (int i=0 ; i < n ; i++)                // printing the required Array
            System.out.print(arr[i]+" ");
    }
}
