class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        return backtrack(board, n, 0);
    }

    public int backtrack(char[][] board, int n, int row) {
        if(row == n) {
            return 1;
        }

        int cnt = 0;

        for(int col = 0; col < n; col++) {
            if(valid(board, row, col, n)) {
                board[row][col] = 'Q';
                cnt += backtrack(board, n, row + 1);
                board[row][col] = '.';
            }
        }

        return cnt;
    }

    public boolean valid(char[][] board, int row, int col, int n) {
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
