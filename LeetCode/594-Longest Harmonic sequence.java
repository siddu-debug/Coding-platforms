class Solution {
    public int findLHS(int[] nums) {
        Map<Integer,Integer> dict = new HashMap<>();
        for(int num : nums){
            dict.put(num, dict.getOrDefault(num, 0) + 1);
        }
        List<Integer> keys=new ArrayList<>(dict.keySet());
        Collections.sort(keys);
        int res = 0;
        for(int i= 1;i<keys.size();i++){
            if(keys.get(i) - keys.get(i-1) == 1){
                res = Math.max(res, (dict.get(keys.get(i)) + dict.get(keys.get(i-1))));


            }
        }
        return res;


        
    }
}
