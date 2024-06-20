import java.util.*;

/*
 * create a function boolean startsWith(String prefix) for a trie
 * returns true if there is a previously inserted string word that has the prefix
 * , and false otherwise.
 * 
 * words[] = {"apple","app","mango",}
 * 
 * 
 * prefix = "app"
 * prefix = "moon"
 * 
 * apprach
 * 1) create trie data structure
 * 
 *            []  
 *          /  | \
 *         a   m   w
 *        /    |     \
 *       p     a       o
 *      /      |        \
 *     p       n         m
 *    /        |          \ 
 *   l        g            a
 *   /        |             \
 *   e        o              n
 * 
 * 
 * boolean startswith(String prefix){
 * Node curr = root
 * for(int i = 0; to prefix.length)
 * idx = prefix.charAt(i) - 'a'
 * if(curr.child[idx] == null)
 * return false
 * curr = curr.child[idx]
 * 
 * 
 * 
 * 
 * }
 */
public class startsWithProblem {

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

    public static boolean startswith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;

    }

    public static void main(String[] args) {
        String words[] = { "apple", "app", "mango", "man", "woman" };
        String prefix1 = "app";
        String prefix2 = "moon";

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        System.out.println(startswith(prefix1));
        System.out.println(startswith(prefix2));
    }

}
