class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(),0 ,res);
        return res;
    }
    public void backtrack(int [] nums, List<Integer> curr, int start, List<List<Integer>> res){
            res.add(new ArrayList<>(curr));
           
        for(int i= start;i<nums.length;i++){
            curr.add(nums[i]);
            backtrack(nums,curr, i+1, res);
            curr.remove(curr.size()-1);
            
        }
    }
}
