import java.util.*;
public class multiArrayList {
    public static void main(String args[]){
        //main list declared
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        //list 1 declared
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        mainList.add(list1);

        //list 2 declared
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        mainList.add(list2);

        // for(int i=0; i<=5; i++){
        //     list1.add(i*1);
        //     list2.add(i*2);
        // }

        //access elements in the list
        for(int i=0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);



     }
    
}
