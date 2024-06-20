import java.util.*;

public class climbingstairs {

    /*
     * count ways to reach the nth stair. the person can climb either 1 stair
     * or 2 stairs at a time.
     * 
     * n = 5
     * 
     * n = 2 ans = 2
     * n = 3 ans = 3
     * n = 4 ans = 5
     * 
     * for 3 stairs
     * 111 to get at stairs 5 add 2
     * 12 + 2
     * 21 + 2
     * 
     * 
     * for 4 stairs
     * 
     * 1111 to get at stairs 5 add 1
     * 112 + 1
     * 121 + 1
     * 211 + 1
     * 22 + 1
     */

    // memoization -O(N) || recursion (2^n) time complexity
    public static int countWays(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        // return countWays(n - 1) + countWays(n - 2);

        // memoization

        if (ways[n] != -1) { // already calculated
            return ways[n];
        }

        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
        return ways[n];

        /*
         * if the no. of ways increase to reach the stairs like can jump at 3 also then
         * one more ways will be added
         */
    }

    // it is same like a fibonacci series code

    /*
     * public static int fib(int n ){
     * if(n == 0 || n ==1 ){
     * retunr n ;
     * }
     * return fib(n-1) + fib(n - 2);
     * 
     * }
     */

    public static void main(String[] args) {

        int n = 5; // n=3 = 3 -> & n = 4 -> => 8
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countWays(n, ways));

    }

}
