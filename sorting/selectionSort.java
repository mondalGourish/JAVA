import java.util.*;

public class selectionSort {
    public static void sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        
        
    }
    public static void input(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void output(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.print("The elements are:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        input(arr,n);
        System.out.println("Before sorting:");
        output(arr,n);

        sort(arr);
        System.out.println();

        System.out.println("After sorting:");
        output(arr,n);
        
    }
}
