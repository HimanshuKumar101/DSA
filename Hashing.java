import java.util.*;

/* Hashing
 * Map: HashMap, LinkedHashmap, TreeMap
 * Set: HashSet, Linked Hashset, Treeset
 * 
 * with the help of anyfunction change the data form. is called Hashing.
 * 
 * HashMpa
 * (key,value)
 *   
 * key is unique (for example like menu one disk is not repeated twice , 
 * value like price can repeat)
 * 
 * 
 time complexity is constant


 * put(key,value)           0(1)
 * get(key)                 0(1)  
 * containsKey(key)         0(1)
 * remove(key)              0(1)
 * 
 * HashMap are Unorder , undefined order.
 * null value if key is not presented
 */

public class Hashing {
    public static void main(String[] args) {
        // create

        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Us", 50);

        System.out.println(hm);
        /*
         * // Get - 0(1)
         * int population = hm.get("India");
         * System.out.println(population);
         * 
         * // containskey
         * System.out.println(hm.containsKey("India"));
         * System.out.println(hm.containsKey("japan"));
         */

        // remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isempty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
