import java.util.*;

public class arrayPairs {
    public static void pairs(int numbers[]){
        int total = 0;
        for(int i =0; i<numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" +curr+ "," +numbers[j]+ ")");
                total++;
            }
            System.out.println();
        }
        System.out.print("Total pairs are: "+total);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int n = sc.nextInt();
        int numbers[]=new int[n];
        //take array as input
        for(int i =0; i<n; i++){
             numbers[i]=sc.nextInt();
        }
        //print the taken input
        System.out.print("Numbers are: ");
        for(int i =0; i<n; i++){
            System.out.print(numbers[i]+ " ");
       }
       System.out.println();
       pairs(numbers);

    }
    
}
