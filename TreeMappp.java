import java.util.*;

/*
 * keys are sorted
 * put,get,remove are O(logn)
 * TreeMap<  > hm = new TreeMap<>();
 * 
 * //implemented by Red Black Tree
 * self balancing trees BST 
 */

public class TreeMappp {
    public static void main(String[] args) {
        TreeMap<String, Integer> lhm = new TreeMap<>();
        lhm.put("India", 100);
        lhm.put("china", 150);
        lhm.put("US", 50);

        System.out.println(lhm);

        // alpabetical sorted while be the result
        // china
    }

}
