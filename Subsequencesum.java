import java.util.ArrayList;
import java.util.List;

public class Subsequencesum {

    public static void printS(int ind, List<Integer> ds, int s, int sum, int[] arr, int n) {
        // Base case
        if (ind == n) {
            if (s == sum) {
                for (int it : ds) {
                    System.out.print(it + " ");
                }
                System.out.println();
            }
            return;
        }

        // Include the current element
        ds.add(arr[ind]);
        s += arr[ind];
        printS(ind + 1, ds, s, sum, arr, n);

        // Exclude the current element
        s -= arr[ind];
        ds.remove(ds.size() - 1);
        printS(ind + 1, ds, s, sum, arr, n);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int n = 3;
        int sum = 2;
        List<Integer> ds = new ArrayList<>();
        printS(0, ds, 0, sum, arr, n);
    }
}
