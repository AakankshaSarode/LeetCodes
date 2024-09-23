import java.util.*;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    int wordLength = 0;
}

class Trie {
    TrieNode root = new TrieNode();
    
    void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.wordLength = word.length();
    }
}

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Trie trie = new Trie();
        buildTrie(trie, Arrays.asList(dictionary)); // Convert array to List<String>
        int[] dp = new int[s.length()];
        
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        
        return s.length() - dfs(s, trie.root, dp, 0);
    }
    
    private void buildTrie(Trie trie, List<String> dictionary) {
        for (String word : dictionary) {
            trie.insert(word);
        }
    }
    
    private int dfs(String s, TrieNode node, int[] dp, int index) {
        if (index == s.length()) return 0;
        if (dp[index] != -1) return dp[index];
        
        int result = dfs(s, node, dp, index + 1); // Case: skipping the current character
        TrieNode currentNode = node;
        
        for (int j = index; j < s.length(); j++) {
            if (currentNode.children.containsKey(s.charAt(j))) {
                currentNode = currentNode.children.get(s.charAt(j));
                if (currentNode.wordLength > 0) {
                    result = Math.max(result, currentNode.wordLength + dfs(s, currentNode, dp, j + 1));
                }
            } else {
                break; // If no matching child node, break out of the loop
            }
        }
        
        dp[index] = result;
        return result;
    }
}
