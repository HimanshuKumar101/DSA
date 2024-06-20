import java.util.*;

public class knapsack {

    /*
     * 0 -1 knapsack
     * 
     * val[] = 15, 14,10, 45, 30
     * wt[] = 2, 5 , 1, 3, 4
     * 
     * w(total allowed weight) = 7
     * 
     * ans = max profit
     * 
     * item(val, wt)
     * / \
     * include exclude
     * (1) (0)
     * wt <= w
     * 
     * 
     * case1: wt<=w
     * / \
     * W = W -wt X
     * 
     * if(wt <= W) //valid
     * 
     * -> if include W - wt, i + 1
     * -> exclude W, i+1
     * 
     * else // not valid
     * 
     * -> exclude w, i + 1
     * 
     * base case
     * / \
     * W index i
     * (capacity) i = n to 0 (i = 0)
     * = 0 ans = 0
     * 
     * 
     * 
     * 
     */

    public static int knapsackk(int val[], int wt[], int W, int n) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) { // valid
            // include
            int ans1 = val[n - 1] + knapsackk(val, wt, W - wt[n - 1], n - 1);

            // exclude

            int ans2 = knapsackk(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
        } else { // not valid
            return knapsackk(val, wt, W, n - 1);
        }

    }

    public static void main(String[] args) {

        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;

        System.out.println(knapsackk(val, wt, W, val.length));

    }

}
