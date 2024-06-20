import java.util.*;

/*
 * find the longest string in words such that every prefix of it is also in words.
 * 
 * words = ["a","banana","app","appl","ap","apply","apple"]
 * 
 * ans = "apple" smaller ans lexicogrpahically alphabetical small 
 * 
 * 1) strings -> single one
 * 2) strings -> lexicographic small aplhabetical small
 * 3) doesn't exist -> " "
 * 
 *                    [.]
 *                   /   \
 *                  a     b
 *                 /       \
 *                p         a
 *               /           \
 *              p             n
 *             /               \
 *            e                 a
 *           /  \                \    
 *          y    e                n 
 *                                 \
 *                                  a
 * 
 *  logic :
 * longest word in Trie -> all chases eow  = true
 * 
 * String temp = " "                  root -> children
 *                                        1) !null 
 * String finalans = apple                2)EOW = T
 * string temp = " "
 * (temp len > ans len)
 * update
 * 
 * 
 * 1) STRING ans    
 * 2) string temp
 * string ans = " " //final ans empty 
 * void longestword(root,temp)
 * 
 * for(int i = 0; to 26)
 * root.child[idx] ! = null && child[idx].eow = = true)
 * temp + add char(root)
 * if(temp len > ans leng)
 * ans = temp
 * longestword(root.child[i],temp) 
 * 
 * 
 * 
 */
public class LongestWordtheallprefix {

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

        public static String ans = "";

        public static void longestword(Node root, StringBuilder temp) {
            if (root == null) {
                return;
            }

            for (int i = 0; i < 26; i++) {
                if (root.children[i] != null && root.children[i].eow == true) {
                    char ch = (char) (i + 'a');
                    temp.append(ch);
                    if (temp.length() > ans.length()) {
                        ans = temp.toString();
                    }

                    longestword(root.children[i], temp);
                    temp.deleteCharAt(temp.length() - 1); // backtrack

                }
            }
        }

        public static void main(String[] args) {

            String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

            for (int i = 0; i < words.length; i++) {
                insert(words[i]);
            }

            longestword(root, new StringBuilder(""));
            System.out.println(ans);

        }

    }
}
