import java.util.*;
public class mergeSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int arr[], int left, int right){
        //base case
        if(left >= right) return;
        
        //find mid
        int mid = left+(right-left)/2;
        //call sort for left
        sort(arr,left,mid);
        //call sort for right
        sort(arr,mid+1,right);

        //merge
        merge(arr,left,mid,right);
    }

    public static void merge(int arr[], int left, int mid, int right){
        //temp array to store the merged elements
        int temp[] = new int[right-left+1];
        int i = left; //pointer to starting of left array
        int j = mid+1; //pointer to starting of right array
        int k = 0; //pointer to starting of temp array

        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++; k++;
            }else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        //for leftover elements in left array if any
        while(i<=mid){
            temp[k] = arr[i];
            i++; k++;
        }
        //for leftover elements in right array if any
        while(j<=right){
            temp[k] = arr[j];
            j++; k++;
        }
        //copying the temp elements in original array
        for(k=0, i=left; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        printArr(arr);
        System.out.println();
        sort(arr,0,arr.length-1);
        printArr(arr);

    }
}
