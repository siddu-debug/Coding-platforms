

class Trie {

    class TrieNode {
        boolean wordEnd;
        HashMap<Character, TrieNode> children;

        TrieNode() {
            wordEnd = false;
            children = new HashMap<>();
        }
    }

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode currNode = root;

        for (char ch : word.toCharArray()) {
            currNode.children.putIfAbsent(ch, new TrieNode());
            currNode = currNode.children.get(ch);
        }

        currNode.wordEnd = true;
    }

    public boolean search(String word) {
        TrieNode currNode = root;

        for (char ch : word.toCharArray()) {
            if (!currNode.children.containsKey(ch)) {
                return false;
            }
            currNode = currNode.children.get(ch);
        }

        return currNode.wordEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode currNode = root;

        for (char ch : prefix.toCharArray()) {
            if (!currNode.children.containsKey(ch)) {
                return false;
            }
            currNode = currNode.children.get(ch);
        }
        return true;
    }
}
