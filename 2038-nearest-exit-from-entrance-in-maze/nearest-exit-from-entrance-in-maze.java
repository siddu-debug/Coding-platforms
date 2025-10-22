import java.util.*;

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int nr = maze.length;
        int nc = maze[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';
        int[][] dir = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int step = curr[2];
            for (int[] d : dir) {
                int newRow = row + d[0];
                int newCol = col + d[1];
                if (newRow >= 0 && newRow < nr && newCol >= 0 && newCol < nc && maze[newRow][newCol] == '.') {
                    if (newRow == 0 || newRow == nr - 1 || newCol == 0 || newCol == nc - 1) {
                        return step + 1;
                    }
                    maze[newRow][newCol] = '+';
                    queue.offer(new int[]{newRow, newCol, step + 1});
                }
            }
        }
        return -1;
    }
}
