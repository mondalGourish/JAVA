import java.util.*;

public class reverseArray {
    
    //using two pointer
    public static void reverse(int l, int r, int arr[]){
        if(l>=r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverse(l+1, r-1, arr);
    }
    //using single pointer
    public static void reverseOne(int i, int arr[]){
        int n = arr.length;
        if(i>=n/2){
            return;
        }
        int temp = arr[n-i-1];
        arr[n-i-1] = arr[i];
        arr[i] = temp;

        reverseOne(i+1, arr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Input array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Reversed Array: ");
        //reverse(0,n-1,arr);
        reverseOne(0,arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
