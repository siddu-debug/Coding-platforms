class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return checkpoly(s,left+1,right) || checkpoly(s,left,right-1);         
        }
        }
        return true;
    }
    private boolean checkpoly(String s, int left, int right){
        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}