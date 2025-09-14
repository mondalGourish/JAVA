import java.util.*;
public class bubbleSort {
    public static void sort(int nums[]){
        int n = nums.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(nums[j]>nums[j+1]){//for ascending order sort
                    int temp = nums[j+1];       //nums[j]<nums[j+1] for descending order sort
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
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
