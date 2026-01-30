
import java.util.Scanner;

class SwapArray2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array : ");
        int n = input.nextInt();
        
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();    
        }

        //calling the recursive function
        swapArr(arr,0,n);

        // prints the array after swaping
        System.out.print("Array after reversing: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // made a method to swap elements
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //recursively swaps the array 
    static void swapArr(int [] arr ,int i , int n){
        if (i >= n/2 ) return;
        swap(arr , i , n-i-1); 
        swapArr(arr, i+1, n);
    }
}