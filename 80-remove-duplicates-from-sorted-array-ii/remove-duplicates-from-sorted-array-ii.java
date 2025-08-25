class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr=0;

        for(int num:nums){
            if(ptr<2 || num != nums[ptr-2]){
                nums[ptr]=num;
                ptr++;
            }
        }
        return ptr;
        
    }
}