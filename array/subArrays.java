import java.util.*;

public class subArrays {
    public static void arrays(int numbers[]){
        int total = 0;
        int maxsum = Integer.MIN_VALUE;//for calculating smallest
        int minsum = Integer.MAX_VALUE;//for calculating largest

        for(int i=0; i<numbers.length; i++){//to get the starting element for each subarray
            int start = i;
            for(int j=i; j<numbers.length; j++){//to get the ending element for each subarray
                int end = j;
                int sum = 0;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k]+" ");
                    sum += numbers[k];

                }
                total++;
                System.out.print("=> sum :" + sum);
                System.out.println();

                if(sum<minsum){
                    minsum = sum;
                }
                if(sum>maxsum){
                    maxsum = sum;
                }

            }
            System.out.println();

        }
        System.out.println("No.of subarrays are: "+total);
        System.out.println("maximum sum: "+maxsum);
        System.out.println("minimum sum: "+minsum);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            numbers[i]=sc.nextInt();
        }
        System.out.print("Numbers are: ");
        for(int i=0; i<n; i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    
        arrays(numbers);
    }
    
}
