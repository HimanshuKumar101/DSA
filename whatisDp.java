public class whatisDp {
    /*
     * what is DP ?
     * 
     * DP is optimized recursion
     * 
     * How to ideentify Dp ?
     * 
     * a) Optimal Problem --> greedy --> (least , most , min , max , largest ,
     * smallest ) optimal problem
     * b) Some choice is given (multiple branches in recursion tree )
     * 
     * 
     * Dynamic programming is a technique in computer programming that helps to
     * efficiently solve a class of problems that have
     * overlapping subproblems means choice and optiomal substructure (chote problem
     * ke answer ko mila kar badi
     * problem ke solution karna means recursion )
     * property.
     * 
     * 
     * Ways of DP
     * 
     * Memoization(Top Down)
     * like fibonacci
     * 
     * recurrsion
     * 
     * subproblems -> storage
     * resuse
     * 
     * Tabulation(Bottom UP) --> iteration
     * 
     * fib[] recurssion
     * 
     * 
     * 
     * 
     */

    public static int fibtabulation(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int f[] = new int[n + 1]; // 0,0,0,0
        System.out.println(fibtabulation(n));

    }

}
