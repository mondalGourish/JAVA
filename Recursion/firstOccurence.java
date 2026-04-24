import java.util.*;
public class firstOccurence {
    public static int first(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return first(arr,key,i+1);
    }

    public static int last(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        //check for the rest parts
        int isFound = last(arr,key,i+1);
        if(isFound != -1){
            return isFound;
        }
        //check for the previous part
        if(arr[i] == key){
            return i;
        }
        return -1;

        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        System.out.println(first(arr,key,0));
        System.out.println(last(arr,key,0));

    }
}
