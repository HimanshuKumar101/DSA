import java.util.*;

/*
 * Tree set
 * 
 * Sorted in ascending order
 * Null values are Not allowed (because we do not know null value where to put in order )
 * 
 * Treeset --> treemap(red black tree ) self balancing
 */
public class TreeeSet {

    public static void main(String[] args) {

        TreeSet<String> tre = new TreeSet<>();

        tre.add("egg");
        tre.add("protein");
        tre.add("milk");
        tre.add("oats");

        System.out.println(tre);

        // order in alphabetical order

    }

}
