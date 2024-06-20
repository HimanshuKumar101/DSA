import java.util.*;

/*
 * HashSet
 * 
 * No duplicates
 * unorder
 * null is allowed
 * 
 * HashSet Operations
 * 
 * HashSet<Integer> hs = new HashSet<>();
 * 
 * add(key) O(1)
 * contains(key) O(1)
 * remove(key) O(1)
 * 
 * 
 */

public class Hashsett {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(null);

        System.out.println(set);

        if (set.contains(3)) {
            System.out.println("set contains 2");
        }
        if (set.contains(2)) {
            System.out.println("set contains 2");
        }

        set.remove(2);

        if (set.contains(2)) {
            System.out.println("set contains 2");
        } else {
            System.out.println("2 does not contains in set");
        }

        System.out.println(set.size());

        set.clear();
        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }

}
