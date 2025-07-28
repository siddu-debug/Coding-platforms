class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dict = new HashMap();
        for(char ch : magazine.toCharArray()){
            if(dict.containsKey(ch)){
                dict.put(ch, dict.get(ch) + 1);
            }
            else{
                dict.put(ch, 1);
            }
        }
        for(char c : ransomNote.toCharArray()){
            if(!dict.containsKey(c)){
                return false;
            }
            else{
                if(dict.get(c) == 0){
                 return false;
                }
                else{
                    dict.put(c, dict.get(c) - 1);
                }

            }

        }
        return true;

        
    }
}
