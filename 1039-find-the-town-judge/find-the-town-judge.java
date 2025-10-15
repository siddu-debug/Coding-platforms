class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] arr=new int[n+1];
        for(int i=0;i<trust.length;i++){
            int p1=trust[i][0];
            int p2=trust[i][1];

            arr[p1] -= 1;
            arr[p2] += 1;
        }
        for(int i=1;i<=n;i++){
            if(arr[i] == n - 1){
                return i;
            }
        }
        return -1;
        
    }
}