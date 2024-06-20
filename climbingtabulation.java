import java.util.*;

/*
 * 1) create table + initialize  (varabile changes here only one varaible changes n )
 * 
 * 2) meaning for index
 * 
 * 3) fill(small to large)
 * 
 * ith -> ith stair ways to reach
 * 
 *            ______________________
 * n = 5 dp = |_1_|_1__|___|___|__|__|
 *              0  1   2   3   4  5
 * 
 * for(int i = 1 to n ){
   *  ways[n] = ways[n-1] + ways[n-2]
 * }
 * 
 *       
 *            
 */

public class climbingtabulation {

    public static int countWaysTab(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(countWaysTab(n));

    }

}
