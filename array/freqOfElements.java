/*Frequency of Elements in Array

Input: [1, 2, 2, 3, 1, 4, 2]

Output:

1 → 2 times
2 → 3 times
3 → 1 time
4 → 1 time */
import java.util.*;
public class freqOfElements {
    public static void frequency(int numbers[],int n){
        boolean visited[] = new boolean[n]; // default false

        for (int i = 0; i < n; i++) {
            // Skip if already counted
            if (visited[i]) {
                continue;
            }

            int count = 1; // count current element

            // Count occurrences
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            // Print result
            if (count == 1) {
                System.out.println(numbers[i] + " => " + count + " time");
            } else {
                System.out.println(numbers[i] + " => " + count + " times");
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
        System.out.println("\nFrequency of elements:");
        frequency(numbers, n);
        
       
    }
    
}
/*Rotate an Array by k Steps

Input: [1, 2, 3, 4, 5], k=2

Output: [3, 4, 5, 1, 2]

🔹 Level 3: Harder (Apply Concepts)

Find Missing Number (1 to n)

Input: [1, 2, 4, 5, 6] (n=6)

Output: 3

Find Duplicate in Array

Input: [1, 3, 4, 2, 2]

Output: 2

🔹 Level 4: Challenge

Longest Subarray with Positive Sum

Input: [1, -2, 3, 4, -1, 2]

Output: 4 ([3, 4, -1, 2]) */
