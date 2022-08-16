import java.util.*;
public class hasshmap{
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();

        // put
        //-----
        // if element is not present then it will insert otherwise it will update the value.

        hm.put("India", 150);
        hm.put("China", 200);
        hm.put("Pakistan", 56);
        hm.put("Australia", 30);
        hm.put("US", 20);

        System.out.println(hm);

        hm.put("Nepal", 15);
        hm.put("India", 250);

        System.out.println(hm);
        System.out.println("--------------------------------------");

        // get 
        //-----
        //if element is present it will return value otherwise it will return null.

        System.out.println(hm.get("India"));
        System.out.println(hm.get("Germany"));
        System.out.println("--------------------------------------");

        // containsKey
        //-------------
        // if element is present then it will return true otherwise false.

        System.out.println(hm.containsKey("Pakistan"));
        System.out.println(hm.containsKey("Bangladesh"));
        System.out.println("--------------------------------------");

        // keySet
        //--------
        // it return the set of key present in the hashmap.

        Set<String> keys = hm.keySet();
        System.out.println(keys);
        System.out.println("--------------------------------------");

        System.out.println("Hashmap");
        System.out.println("--------------------------------------");
        for(String key : hm.keySet()){
            int val = hm.get(key);
            System.out.println(key+" -> "+val);
        }
        System.out.println("--------------------------------------");

    }
}