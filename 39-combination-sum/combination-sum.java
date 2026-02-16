class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(new ArrayList<>(), candidates, target,0, res);
        return res; 
    }
    public void backtrack(List<Integer> curr, int[] candidates,int target, int start,List<List<Integer>> res){
    if(target == 0){
        res.add(new ArrayList(curr));
        return;
    }
    if(target > 0){
        for(int i=start;i<candidates.length;i++){
            curr.add(candidates[i]);
            backtrack(curr, candidates, target-candidates[i],i, res);
            curr.remove(curr.size() - 1);
            
        }
    }

    }
}
