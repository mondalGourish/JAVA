import java.util.Scanner;

public class countingSort {
    public static void sort(int nums[]){
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int count[] = new int[max+1];
        for(int i=0 ; i<n; i++){
            count[nums[i]]++;
        }
        int idx = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                nums[idx] = i;
                idx++;
                count[i]--;        
            }
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int num[] = new int[n];
        
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println();
        sort(num);
        System.out.print("Sorted array: ");
        for(int i=0; i<n; i++){
            System.out.print(num[i]+" ");
        }

        sc.close();
    }
    
}
