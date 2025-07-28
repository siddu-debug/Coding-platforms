class Hashmap {
    public int[] twoSum(int[] nums,int target){
        Map<Integer, Integer> dict = new Hashmap<>();
        int n = nums.lenght;
        for (int i=0;i<n;i++){
            int t=target-nums[i];
            if(dict.containskey(t)){
                int[] res = new int[]{i,ditc.get(t)};
                return res;
            }
            else{
                dict.put(nums[i],i);
            }
            }
            return new int[]{};
        }
}

        
