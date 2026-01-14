import java.util.*;
public class maxElement {
    public static int max(ArrayList<Integer> list){
        int max = 0;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
            //max = Math.max(max,list.get(i));
        }
        return max;
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
        int max = max(list);
        System.out.print("Maximum is :" +max);
        System.out.println();

        //sorted 
        Collections.sort(list);
        System.out.print("The sorted list" +list);

    }
}
