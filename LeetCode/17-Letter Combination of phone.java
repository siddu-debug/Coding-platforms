import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character, String> dict = new HashMap<>();
        dict.put('2', "abc");
        dict.put('3', "def");
        dict.put('4', "ghi");
        dict.put('5', "jkl");
        dict.put('6', "mno");
        dict.put('7', "pqrs");
        dict.put('8', "tuv");
        dict.put('9', "wxyz");

        int n = digits.length();
        if (n == 0) {
            return new ArrayList<>();
        }

        List<String> result = toList(dict.get(digits.charAt(0)));
        for (int i = 1; i < n; i++) {
            result = combine(result, toList(dict.get(digits.charAt(i))));
        }

        return result;
    }

    private List<String> toList(String s) {
        List<String> myList = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            myList.add(String.valueOf(ch));
        }
        return myList;
    }

    private List<String> combine(List<String> s1, List<String> s2) {
        List<String> arr = new ArrayList<>();
        for (String a : s1) {
            for (String b : s2) {
                arr.add(a + b);
            }
        }
        return arr;
    }
}
