/*Second Largest Element in Array

Input: [10, 20, 5, 8, 30] → Output: 20 */
import java.util.*;
public class secondLargest {
    public static int largestSecond(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>largest){
                secondLargest = largest;
                largest = numbers[i];
            }else if(numbers[i]>secondLargest && numbers[i] != largest){
                secondLargest = numbers[i];
            }
        }
        return secondLargest;

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
        int result = largestSecond(numbers);
        System.out.println("The second largest number is "+result);
        
    }
    
}
