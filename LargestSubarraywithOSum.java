import java.util.*;

/*
 * 
 * largest subarray with 0 sum
 * 
 * arr = {15,-2,2,-8,1,7,10}
 * 
 * sum[0,i]
 * sum[0,j]
 * 
 * sum[i+1,j] = sum[0,j] - sum[0,i]
 * 
 * 0 = sum(j) - sum(i)
 * sum(j) = sum(i)
 * 
 * sum(i+1,j) = 0
 * 
 * for(int j = 0 to n)
 * if(sum exist in map)
 * len --> len,j-i
 * else
 *     map.put(sum,j)
 * 
 * (15,0)
 * (13,1)
 * (7,3)
 * (8,4)
 * (25,6)
 * 
 * (sum,idx)
 * 
 * 
 * 
 * 
 */
public class LargestSubarraywithOSum {
    public static void main(String[] args) {

        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

        HashMap<Integer, Integer> map = new HashMap<>();
        // (sum, idx)
        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("largest subarray with sum as 0 => " + len);
    }

}
