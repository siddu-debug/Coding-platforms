class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,List<Integer>> dict = new HashMap<>();
        for(int num:nums){
            int sum = digitSum(num);
            if(!dict.containsKey(sum)){
                dict.put(sum, new ArrayList<>());
            }
            dict.get(sum).add(num);
        }
        int res = -1;
        for(List<Integer> arr : dict.values()){
            if(arr.size() >= 2){
                Collections.sort(arr);
                int n=arr.size();
                res = Math.max(res, (arr.get(n - 2) + arr.get(n - 1)));
            } 


        }
        return res;
    }
    private int digitSum(int num){
        int tot = 0;
        while(num > 0){
            tot += num % 10;
            num = num / 10;
        }
        return tot;

    }
}
