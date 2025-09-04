class Solution {
    public boolean backspaceCompare(String s, String t) {
        int idxs = s.length() - 1;
        int idxt = t.length() - 1;
        int skips = 0, skipt = 0;

        while (idxs >= 0 || idxt >= 0) {

            while (idxs >= 0) {
                if (s.charAt(idxs) == '#') {
                    skips++;
                    idxs--;
                } else if (skips > 0) {
                    idxs--;
                    skips--;
                } else {
                    break;
                }
            }

            while (idxt >= 0) {
                if (t.charAt(idxt) == '#') {
                    skipt++;
                    idxt--;
                } else if (skipt > 0) {
                    idxt--;
                    skipt--;
                } else {
                    break;
                }
            }
            if (idxs >= 0 && idxt >= 0 && s.charAt(idxs) != t.charAt(idxt)) {
                return false;
            }

            if ((idxs >= 0) != (idxt >= 0)) {
                return false;
            }

            idxs--;
            idxt--;
        }

        return true;
    }
}
