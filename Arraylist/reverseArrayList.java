import java.util.*;
public class reverseArrayList {
    public static void reverse(ArrayList<Integer> list){
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        //take input for arraylist
        System.out.print("Enter elements:");
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
            
        }
        System.out.print("ArrayList:"+ list);
        System.out.println();
        System.out.print("ArrayList after reverse:" );
        reverse(list);

    }
}
