class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        int left = 0, cnt = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            dict.put(ch, dict.getOrDefault(ch, 0) + 1); // ✅ fixed method name

            while (dict.size() == 3) { // ✅ replaced () with {}
                cnt += s.length() - right; // ✅ count substrings
                char dch = s.charAt(left);
                dict.put(dch, dict.get(dch) - 1);
                if (dict.get(dch) == 0) {
                    dict.remove(dch);
                }
                left++; // ✅ added missing semicolon
            }
        }
        return cnt;
    }
}
