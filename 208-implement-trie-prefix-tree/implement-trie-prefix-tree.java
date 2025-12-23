class Trie {
    class TrieNode{
        boolean wordEnd;
        TrieNode[] children;
        public TrieNode(){
            wordEnd=false;
            children=new TrieNode[26];

        }
    }
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode currNode=root;
        for(char ch:word.toCharArray()){
            if(currNode.children[ch -'a']== null){
                currNode.children[ch - 'a']=new TrieNode();
            }
            currNode=currNode.children[ch - 'a'];
        }
        currNode.wordEnd = true;
        
    }
    
    public boolean search(String word) {
        TrieNode currNode=root;
        for(char ch : word.toCharArray()){
            if(currNode.children[ch- 'a'] == null){
                return false;
            }
            currNode=currNode.children[ch-'a'];
        }
        return currNode.wordEnd;
        
    }
    
    public boolean startsWith(String prefix) {
        TrieNode currNode=root;
        for(char ch : prefix.toCharArray()){
            if(currNode.children[ch-'a']== null){
                return false;
            }
            currNode=currNode.children[ch-'a'];

        }
        return true;
    


    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */