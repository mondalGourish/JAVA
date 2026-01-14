import java.util.*;

public class addElement {
    public static void main(String args[]){
        //declare arrayList
        ArrayList<Integer> list = new ArrayList<>();

        //add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);

        //get element
        int element = list.get(2);
        System.out.println(element);

        //remove element
        int del = list.remove(2);
        System.out.println(del);
        System.out.println(list);

        //set element at an index
        list.set(2,10);
        System.out.println(list);

        //contains element
        System.out.println(list.contains(2));
        System.out.println(list.contains(6));

        //size of arrayList
        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }


    }    
}
