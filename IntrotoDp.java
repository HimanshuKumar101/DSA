public class IntrotoDp {

    // fibonacci series
    /*
     * the recursssion way is very delay it find the fiboconni again and again
     * to overcome it we have made the f[n] array to store the numbers whose
     * fibonacci
     * is already out
     * 
     * earlier the number which already fibonaaci occur was again was find in other
     * branch.
     * fib(n) = fib(n-1) + fib(n-2)
     * 4 3
     * 
     * now series will look like
     * 6
     * /\
     * 5 4
     * /\
     * 4 3
     * /\
     * 3 2
     * / \
     * 2 1
     * /\
     * 1 0
     * 
     * skewed tree
     */

    // this processs is also called memoization
    public static int fib(int n, int f[]) { // O(n)

        if (n == 0 || n == 1) {
            return n;
        }

        if (f[n] != 0) {
            return f[n];
        }

        f[n] = fib(n - 1, f) + fib(n - 2, f);
        return f[n];
    }

    public static void main(String args[]) {
        int n = 5;
        int f[] = new int[n + 1]; // 0 0 0 0 0 0
        System.out.println(fib(n, f));

    }

}
