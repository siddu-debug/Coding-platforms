class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int asum=n*(n+1)/2;
        int csum=0;

        for(int num : nums){
            csum+=num;
        }
        return asum-csum;
        
    }
}