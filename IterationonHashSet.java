import java.util.*;

/*
 * Iteration on hashset
 * 
 * a) using Iterators
 * 
 * Iterator it = set.iterator()
 * while(it.hasNext()){
 * print(it.next())
 * 
 * }
 * 
 * 
 * 
 * b) using enhanced for loop
 * 
 * 
 */
public class IterationonHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");

        /*
         * Iterator it = cities.iterator();
         * while (it.hasNext()) {
         * System.out.println(it.next());
         * }
         */

        for (String city : cities) {
            System.out.println(city);
        }
    }

}
