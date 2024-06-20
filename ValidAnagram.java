import java.util.*;

/*
 * Valid anagram
 * Given two strings s and t, return true if it is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * 
 * 
 * s= " race" t="care" true
 * s="heart" t="earth" true
 * s="tulip" t="lipid" false
 * 
 * 
 *approach s="knee" t="keen"
 HashMap<character, frequency>
          char       int


map.isempty()--> true-->true
         |
         |_ false -> false
 * 
 * 
 * 
 * 1) add(char,freq) of "s" in map
 * 2) loop on "t"
 * 3) map.empty --true
 *             - false
 * 
 * 
 */

public class ValidAnagram {

    public static boolean isAnangram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map.get(ch) != null) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }

        }

        return map.isEmpty();

    }

    public static void main(String[] args) {
        String s = "race"; // time comple O(n)
        String t = "care";

        System.out.println(isAnangram(s, t));

    }
}
