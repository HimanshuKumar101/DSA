import java.util.*;

/*
 * arr1 = {7,3,9}
 * arr2= {6,3,9,2,9,4}
 * 
 * union = 6(7,3,9,6,2,4)
 * intersection = 2{3,9}
 * 
 * 
 * union
 * arr1 --> set     }   set.size()
 * arr2---> set     }    union
 * 
 * intersection
 * 1) add all elememt of arr1
 * 2) for(int i = 0 to arr 2 length)
 * check if exists in set
 * count++
 * remove(elemet)
 * 
 */
public class UnionandIntersection {
    public static void main(String[] args) {

        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };
        HashSet<Integer> set = new HashSet<>();

        // union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("union = " + set.size());
        System.out.println("and elements are" + set);

        // intersection
        set.clear();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                System.out.println("common elements are " + arr2[i]);
                
                set.remove(arr2[i]);
            }
        }
        System.out.println("intersection = " + count);

    }

}
