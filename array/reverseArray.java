import java.util.*;

public class reverseArray {
    public static void reverse(int numbers[]){
        int start = 0, end = numbers.length-1;

        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;  
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
        System.out.println("");
        reverse(numbers);
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println("");

}
}
