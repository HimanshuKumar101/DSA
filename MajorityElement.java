import java.util.*;

/*
 * 
 * Given an integer array of size n, find all elements that appear more than [n/3] times
 * 
 * nums[] = {1,3,2,5,1,3,1,5,1};
 * //1
 * (1,4) <--- 4 > n/3
 * (3,2)
 * (2,1)
 * (5,2)
 */
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            /*
             * if (map.containsKey(arr[i])) {
             * map.put(arr[i], map.get(arr[i]) + 1);
             * 
             * } else {
             * map.put(arr[i], 1);
             * }
             */

            // all the above code are write in single line
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Integer key : map.keySet()) { // loop ke andar map
            if (map.get(key) > arr.length / 3) {
                System.out.println(key);
            }
        }

    }

}
