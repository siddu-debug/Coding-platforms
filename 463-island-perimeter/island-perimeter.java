class Solution {
    public int islandPerimeter(int[][] grid) {
        int nr = grid.length;
        int nc = grid[0].length;

        int peri = 0;

        for (int row = 0; row < nr; row++) {
            for (int col = 0; col < nc; col++) {
                if (grid[row][col] == 1) {
                    peri += 4;

                    // Check left neighbor
                    if (col > 0 && grid[row][col - 1] == 1) {
                        peri -= 2;
                    }

                    // Check top neighbor
                    if (row > 0 && grid[row - 1][col] == 1) {
                        peri -= 2;
                    }
                }
            }
        }
        return peri;
    }
}
