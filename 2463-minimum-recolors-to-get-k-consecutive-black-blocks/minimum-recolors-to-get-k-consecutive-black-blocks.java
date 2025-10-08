class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left =0;
        int curCnt=0;
        int minCnt=Integer.MAX_VALUE;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                curCnt ++;
            }
        }
        minCnt=curCnt;

        for(int right=k;right<blocks.length();right++){
            if(blocks.charAt(left)=='W'){
                curCnt--;
            }
            if(blocks.charAt(right)=='W'){
                curCnt++;
            }
            minCnt=Math.min(minCnt, curCnt);
            left++;
        }
        return minCnt;

        
        
    }
}