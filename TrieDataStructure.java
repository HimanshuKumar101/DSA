import java.util.*;

/*
 * Trie 
 * know as prefix tree or retrieval tree
 * 
 * what is a trie ?
 * words[] = "the","a","there ","their","any","thee"
 * 
 *            [.](root)
 *           /  \
 *          t   a
 *         /      \
 *        h        n
 *       /          \ 
 *      e __ e       y
 *     / \
 *    r   i 
 *   /     \
 *  e      r
 *    
 * 
 * same term saved seprated
 * 
 * give good time complexity
 * give optimize solution
 * 
 * class Node {
 *    Node[] children;  //26 size of array 
 *   boolean endOfWord;
 * }
 * 
 * 1) children
 * 2) end of word = false
 * 
 * 
 */

static class Node {
    Node children[] = new Node[26];
    boolean eow = false;

    Node() {
        for (int i = 0; i < 26; i++) {
            children[i] = null;

        }

    }

}

public class TrieDataStructure {
    public static void main(String[] args) {

        String words[] = { "the", "a", "there", "their", "any", "thee" };

    }

}
