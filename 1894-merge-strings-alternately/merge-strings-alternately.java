class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n=Math.min(word1.length(), word2.length());
        String res ="";

        for(int i=0;i<n;i++){
            res+=word1.charAt(i);
            res+=word2.charAt(i);
        }
        if(word1.length()>n){
            res+=word1.substring(n);
        }
        if(word2.length()>n){
            res+=word2.substring(n);
        }
        return res;
        
    }
}