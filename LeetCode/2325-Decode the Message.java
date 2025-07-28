import java.util.*;

class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> dict = new HashMap<>();
        char cur_ch = 'a';

        for (char ch : key.toCharArray()) {
            if (Character.isLetter(ch) && !dict.containsKey(ch)) {
                dict.put(ch, cur_ch);
                cur_ch++;
            }
        }

        dict.put(' ', ' ');
        StringBuilder res = new StringBuilder();

        for (char c : message.toCharArray()) {
            res.append(dict.get(c));
        }

        return res.toString();
    }
}
