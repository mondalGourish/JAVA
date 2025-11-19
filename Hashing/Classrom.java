import java.util.*;
public class Classrom {
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",200);
        hm.put("Uk",250);
        hm.put("Brazil",50);
        System.out.println(hm);

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println(k +","+ hm.get(k));
        }
        System.out.println();
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            System.out.println(e.getKey()+","+ e.getValue());
        }
    }
}
