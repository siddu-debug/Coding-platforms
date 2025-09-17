class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m = s2.length();
        int n = s1.length();
        if((m+n) !=s3.length()){
            return false;
        }
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0]=true;

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if((j>0) && (dp[i][j-1]) && (s1.charAt(j-1)==s3.charAt(i+j-1))){
                    dp[i][j]=true;
                }
                if((i>0) && dp[i-1][j] && (s2.charAt(i-1) == s3.charAt(i+j-1))){
                    dp[i][j]=true;

                }
            }
        }
        return dp[m][n];
        


        
    }
}