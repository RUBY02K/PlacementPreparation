import java.util.*;

class Solution {

    class Pair {
        int first;
        int second;

        Pair(int i, int j) {
            this.first = i;
            this.second = j;
        }
    }

    public boolean isValid(int i, int j, int n, int m) {
        return (i >= 0 && j >= 0 && i < n && j < m);
    }

    public int swimInWater(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        int low = grid[0][0];
        int high = grid[0][0];

        // Maximum height find karo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                high = Math.max(high, grid[i][j]);
            }
        }

        int ans = high;

        while (low <= high) {

            int guess = low + (high - low) / 2;

            if (bfs(grid, n, m, guess)) {
                ans = guess;
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }

        return ans;
    }

    public boolean bfs(int[][] grid, int n, int m, int guess) {

        if (grid[0][0] > guess)
            return false;

        Queue<Pair> q = new LinkedList<>();

        boolean[][] visited = new boolean[n][m];

        q.offer(new Pair(0, 0));
        visited[0][0] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!q.isEmpty()) {

            Pair curr = q.poll();

            int row = curr.first;
            int col = curr.second;

            if (row == n - 1 && col == m - 1)
                return true;

            for (int k = 0; k < 4; k++) {

                int newRow = row + dr[k];
                int newCol = col + dc[k];

                if (isValid(newRow, newCol, n, m)
                        && !visited[newRow][newCol]
                        && grid[newRow][newCol] <= guess) {

                    visited[newRow][newCol] = true;
                    q.offer(new Pair(newRow, newCol));
                }
            }
        }

        return false;
    }
}