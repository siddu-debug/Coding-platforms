class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p1 = 0;
        int p2 = 0;
        while(p2 < n){
            if(nums[p2]!=0){
                nums[p1] = nums[p2];
                p1++;
            }
                p2++;
            }
        while(p1<n){
            nums[p1]=0;
            p1++;
        }

        }
        
    }
