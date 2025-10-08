class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zcnt=0;
        int maxLen=0;
        int curLen=0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zcnt++;
            }
            while(zcnt>1){
                if(nums[left]==0){
                    zcnt--;
                }
                left++;  
            }
            curLen=right-left;
            maxLen=Math.max(maxLen, curLen);
        }
        return maxLen;
        }

        
    }
