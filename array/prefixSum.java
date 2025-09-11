import java.util.*;

public class prefixSum {
    public static void prefix(int numbers[]){
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        //prefix array which will be equal to the length of the given array
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1; i<numbers.length; i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;

                currSum = start == 0? prefix[end] : prefix[end] - prefix[start-1];

                if(max<currSum){
                    max = currSum;
                }
            }
        }
        System.out.println("max sum ="+max);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter the array elements:");

        for(int i =0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Numbers are: ");

        for(int i =0; i<n; i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        prefix(numbers);

        
    }
    
}
