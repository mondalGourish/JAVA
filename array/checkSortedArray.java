/*Check if Array is Sorted

Input: [1, 2, 3, 4, 5] → Output: Sorted

Input: [1, 3, 2, 4] → Output: Not Sorted */
import java.util.*;
public class checkSortedArray {
    public static void sortedArrayCheck(int numbers[]){
        boolean isSorted = true;
        for(int i=0; i<numbers.length-1; i++){

            if(numbers[i]>numbers[i+1]){
                isSorted = false;
                break;
            }
            
        }
        if(isSorted){
            System.out.println("Sorted");
        }else{
            System.out.println("Not sorted");
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
        sortedArrayCheck(numbers);
    }
    
}
