import java.util.*;

/*
 * 
 * "chennai" -> "bengaluru"
 * "mumbai" -> "delhi"
 * "goa"->"chennai"
 * "delhi"->"goa"
 * 
 * "Mumai" -> "delhi"->"goa"->"chennai"->benagluru
 *  
 *  APPROACH
 * (from , to)
 * 
 * start point will be : from correct to X
 * 
 * from    to
 * ch       b
 * m        d        
 * g        c
 * d       g
 * 
 * <from,to> map
 * <to,from> row map
 * 
 *  
 * 
 * from to
 */

public class SubarraysumEqualtoK {
    public static void main(String[] args) {

        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum,count)

        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j]; // sum(j)
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        System.out.println(ans);

    }
}
