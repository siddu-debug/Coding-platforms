public class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int ptr=0;

        while(left<nums.length){
            if((ptr == 0) ||(nums[left] != nums[ptr-1])){
                nums[ptr]=nums[left];
                ptr++;
                left++;
            }
            else{
                left++;
            }
            }
            return ptr;
        }
        
}
