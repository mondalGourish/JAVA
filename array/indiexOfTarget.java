import java.util.*;
public class indiexOfTarget {
    //brute force approach O(n)
    //best approach using binary search O(logn)
    public static int index(int num[], int target){
        for(int i=0; i<num.length; i++){
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target element:");
        int target = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.print("The number is found at index: "+ index(nums,target));

    }

    
}
