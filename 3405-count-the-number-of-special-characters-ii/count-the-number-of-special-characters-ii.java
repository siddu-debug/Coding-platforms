class Solution {

    public int numberOfSpecialChars(String word) {

        int count = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {

            int lowerLast = word.lastIndexOf(ch);

            int upperFirst = word.indexOf(Character.toUpperCase(ch));

            if (lowerLast != -1 &&
                upperFirst != -1 &&
                lowerLast < upperFirst) {

                count++;
            }
        }

        return count;
    }
}