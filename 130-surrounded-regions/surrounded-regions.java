class Solution {
    public void solve(char[][] board) {

        int nr = board.length;
        if (nr == 0) return;
        int nc = board[0].length;
        for (int col = 0; col < nc; col++) {
            if (board[0][col] == 'O') {
                dfs(board, 0, col, nr, nc);
            }
            if (board[nr - 1][col] == 'O') {
                dfs(board, nr - 1, col, nr, nc);
            }
        }

        for (int row = 0; row < nr; row++) {
            if (board[row][0] == 'O') {
                dfs(board, row, 0, nr, nc);
            }
            if (board[row][nc - 1] == 'O') {
                dfs(board, row, nc - 1, nr, nc);
            }
        }

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == 'T') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col, int nr, int nc) {

        if (row < 0 || col < 0 || row >= nr || col >= nc || board[row][col] != 'O') {
            return;
        }

        board[row][col] = 'T';

        dfs(board, row + 1, col, nr, nc);
        dfs(board, row - 1, col, nr, nc);
        dfs(board, row, col + 1, nr, nc);
        dfs(board, row, col - 1, nr, nc);
    }
}
