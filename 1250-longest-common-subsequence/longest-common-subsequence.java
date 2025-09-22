class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text2.length();
        int n = text1.length();

        int [][] dp=new int [m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j =1;j<=n;j++){
                if(text2.charAt(i-1)==text1.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int top=dp[i-1][j];
                    int left=dp[i][j-1];
                    dp[i][j]=Math.max(top, left);
                }
                }
            }
            return dp[m][n];
        }

        
    }
