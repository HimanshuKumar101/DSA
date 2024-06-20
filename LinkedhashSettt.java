import java.util.*;

/*
 * LInkedHashset
 * 
 * Order list sequence wise
 */
public class LinkedhashSettt {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("delhi");
        lhs.add("mumbai");
        lhs.add("noida");
        lhs.add("bengaluru");

        System.out.println(lhs);

        lhs.remove("delhi");

        System.out.println(lhs);

    }

}
