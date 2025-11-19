/*Rotate an Array by k Steps

Input: [1, 2, 3, 4, 5], k=2

Output: [3, 4, 5, 1, 2]*/
import java.util.*;
public class rotateArray {
    public static void rotate(int arr[],int key){
        for(int i=0; i<arr.length; i++){
            if(i == key){

            }
        }

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
        System.out.println();
        System.out.print("Enter the index to rotate: ");
        int x = sc.nextInt();

        System.out.println("The rotated array is:");
        rotate(numbers, x);
        
    }
    
}
