class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        final int MOD = 12345;
        
        int[][] dp = new int[n][m];

        long total = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = (int) total;
                total = (total * grid[i][j]) % MOD;
            }
        }

        total = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = (int) ((dp[i][j] * total) % MOD);
                total = (total * grid[i][j]) % MOD;
            }
        }

        return dp;
    }
}