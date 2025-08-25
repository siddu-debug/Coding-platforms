class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
         
        int left=0;
        int right=n-1;
        int ptr=n-1;

        while(left<=right){
            int leftsq=nums[left]*nums[left];
            int rightsq=nums[right]*nums[right];
            if(leftsq>rightsq){
                res[ptr]=leftsq;
                left++;
                ptr--;
            }
            else{
                res[ptr]=rightsq;
                right--;
                ptr--;
            }
        }
        return res;
    }
}

        
    
