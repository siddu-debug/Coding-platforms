class Solution {
    public int minBitFlips(int start, int goal) {
        int flips=0;
        int num=start ^ goal;

        while(num != 0){
            num=num & (num-1);
            flips++;
        }
        return flips;

        
    }
}