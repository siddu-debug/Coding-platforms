class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        int res = 0;
        for(char ch : s.toCharArray()){
                dict.put(ch, dict.get(ch) + 1);
                if(dict.get(ch) % 2 == 0){
                    res += 2;

                }
            }
        
        return (res == s.length()) ? res : res + 1;
        }
        

        
    }
