class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] dp = new int[m][n];
        int mx=0;
        for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j] - '0';
            mx=Math.max(mx, dp[0][j]);
        }
        for(int i=0;i<m;i++){
            dp[i][0]=matrix[i][0]- '0';
            mx=Math.max(mx, dp[i][0]);
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]=='1'){
                    int left=dp[i][j-1];
                    int dia=dp[i-1][j-1];
                    int top=dp[i-1][j];
                    dp[i][j]=Math.min(Math.min(left, dia), top)+1;
                    mx=Math.max(mx, dp[i][j]);
                }
            }
        }
        return mx * mx;
    }
}
        
    
