import java.util.*;

/*
 * find shortest unique prefix for every word in a given list.
 * assume no words is prefix of another
 * 
 * arr[] = {"zebra","dog","duck","dove"};
 * ans = {"z","dog","du","dov"};
 * 
 * approach
 * 1) create a trie
 *         []Node -1
 *         /  \ 
 *         3d   z 1
 *        / \    \
 *       2o  1u   1 e
 *      / \   \    \
 *     1g  1v  1 c   1b
 *          \   \      \
 *          1 e   1 k   1r
 *                       \
 *                        1a
 * 
 * from d total 3  branch are there so there is 3 frequency
 * class Node {
 * Node children[26]
 * boolean eow
 * int freq
 * 
 * insert
 * if curr.child[idx]
 *  == null
 *   new node
 * else
 *   freq++
 * 
 *  
 * 
 * }
 */

public class WordbreakProblem {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root; // Added this line to initialize 'curr'
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root, String ans) {
        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPrefix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        root.freq = -1;
        findPrefix(root, "");
    }
}
