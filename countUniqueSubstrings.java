import java.util.*;

/*
 * Count unique substrings
 * 
 * given a string of length n of lowercase alphabet characters, we neeed 
 * to count total numbers of distinct substrings of this string.
 * 
 * str = "ababa"
 * ans = 10
 * 
 * all substring 
 * 
 * a      ab     aba     abab  ababa
 * b      ba     bab     baba   " "   null
 * a(X)   ab(X)  aba(X)
*  b(X)   ba(X)   
 * a(X) 
 * 
 * unique substring = all prefix of all suffix = all suffix of all prefix
 * 
 * ababa 
 * 
 * all suffix   all prefix of suffix
 * ababa        a ab aba abab ababa
 * baba         b ba bab baba
 * aba          a ab aba
 * ba           b ba
 * a            a
 * 
 * now remove duplicate prefix
 * 
 * unique prefix = count of nodes of trie
 * 1) find all suffix of string
 * 2) create TRIE + INSERT suffix
 * 3) count nodes of tries = unique prefix = unique strings
 * 
 * 
 * for(int i = 0 to n)
 * str.substring(i)
 * 
 * int countnodes(root)
 * (root == null)
 * return 0
 * 
 * 
 * for(int i = 0 to 26)
 * if(root.child[i]! = null)
 count =  count nodes(root.child[i])
 retun cout

 * 
 *     
 */
public class countUniqueSubstrings {

    static class Node {
        Node children[] = new Node[26]; // 'a'-'z'
        boolean eow = false;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {

        String str = "apple"; // ans = 10

        // suffix -> insert in trie

        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }

        System.out.println(countNodes(root));

    }

}
