import java.util.*;
public class binarySearch {
    public static int search(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Numbers are: ");
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println("");
        System.out.print("Enter the key you want to search: ");
        int key = sc.nextInt();
        System.out.println("The key is found at index: "+ search(numbers,key));
    }
}
