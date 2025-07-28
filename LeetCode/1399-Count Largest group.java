class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> dict = new HashMap<>();
        for(int i=1;i<=n;i++){
           int sum = digitSum(i);
           dict.put(sum, dict.getOrDefault(sum, 0) + 1);
        }
        int mx = 0;
        for(int val : dict.values()){
            if(val > mx){
                mx = val;
            } 
        }
        int cnt = 0;
        for(int val : dict.values()){
            if(val == mx){
                cnt ++;
            }
        }
        return cnt;
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
