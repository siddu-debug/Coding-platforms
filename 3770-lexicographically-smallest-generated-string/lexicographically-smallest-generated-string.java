class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        char[] word = new char[n + m - 1];
        boolean[] locked = new boolean[n + m - 1];

        for (int i = 0; i < word.length; i++) word[i] = '?';

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    if (word[i+j] == '?' || word[i+j] == str2.charAt(j)) {
                        word[i+j] = str2.charAt(j);
                        locked[i+j] = true;
                    } else return "";
                }
            }
        }

        for (int i = 0; i < word.length; i++) {
            if (word[i] == '?') word[i] = 'a';
        }

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                boolean match = true;

                for (int j = 0; j < m; j++) {
                    if (word[i+j] != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    boolean done = false;

                    for (int j = m-1; j >= 0; j--) {
                        if (!locked[i+j]) {
                            for (char c = 'a'; c <= 'z'; c++) {
                                if (c != str2.charAt(j)) {
                                    word[i+j] = c;
                                    done = true;
                                    break;
                                }
                            }
                        }
                        if (done) break;
                    }

                    if (!done) return "";
                }
            }
        }

        return new String(word);
    }
}