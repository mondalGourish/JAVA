import java.util.*;
public class subsequenceWithSumK {


    //function to print all subsequence
    // public static void printSubseq(int i, int arr[], ArrayList<Integer>list, int sum, int k){
    //     //check for the sum if equal to k
    //     if(i == arr.length){
    //         if(sum == k){
    //             System.out.println(list);
    //         }
    //         return;
    //     }
    //     //check for the take case
    //     list.add(arr[i]);
    //     sum += arr[i];
    //     printSubseq(i+1,arr,list,sum,k);

    //     //backtrack
    //     sum -= arr[i];
    //     list.remove(list.size()-1);

    //     //not pick case
    //     printSubseq(i+1,arr,list,sum,k);
    // }


    //function to print only one subsequence
    // public static boolean printSubseq(int i, int arr[], ArrayList<Integer>list, int sum, int k){
    //     if(i == arr.length){
    //         if(sum == k){
    //             System.out.println(list);
    //             return true;
    //         }else return false;
    //     }

    //     //take case
    //     list.add(arr[i]);
    //     sum += arr[i];
    //     //if print one return
    //     if(printSubseq(i+1,arr,list,sum,k) == true){
    //         return true;
    //     }

    //     //backtrack
    //     sum -= arr[i];
    //     list.remove(list.size()-1);

    //     //not take case
    //     if(printSubseq(i+1,arr,list,sum,k) == true){
    //         return true;
    //     }
    //     return false;
    // }

    //function to print the count of subsequence whose sum = k
    public static int countSubSeq(int i, int arr[], int sum, int k){
        if(i == arr.length){
            if(sum == k){
                return 1;
            }else return 0;
        }

        sum += arr[i];
        int left = countSubSeq(i+1, arr, sum, k);

        sum -= arr[i];

        int right = countSubSeq(i+1, arr, sum, k);

        return left+right;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int k = sc.nextInt();
        int sum = 0;
        //printSubseq(0,arr,list,sum,k);
        System.out.println(countSubSeq(0,arr,sum,k));
    }
}
