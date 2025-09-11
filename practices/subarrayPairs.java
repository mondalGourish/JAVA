import java.util.*;
public class subarrayPairs {
    public static void pairs(int numbers[]){
        int total = 0;
        for(int i=0; i<numbers.length; i++){
           int start = i;
           for(int j=i; j<numbers.length; j++){
            int end = j;
            int sum = 0;
            for(int k= start; k<= end; k++){
                System.out.print(numbers[k]+" ");
                sum += numbers[k];
            }
            total++;
            System.out.print("=> sum :"+sum);
            
            System.out.println();
             
           } 
           System.out.println();

        }
        System.out.print("The total pairs are :"+total);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //take the numbers of array elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        //take the elements as input
        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        //print the elements
        System.out.print("The numbers are:");
        for(int i=0; i<numbers.length; i++){
            System.out.print("|"+numbers[i]+"|");
        }
        System.out.println();
        pairs(numbers);
    }
    
}
