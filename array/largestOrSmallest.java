import java.util.*;

public class largestOrSmallest {
    public static int compare(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest element is  "+ smallest);

        return largest;



    }
    public static void main(String args[]){
        System.out.print("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numbers[] = new int[n];

        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Numbers are:");

        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println("");

        System.out.println("largest number: " + compare(numbers));

    }


}
