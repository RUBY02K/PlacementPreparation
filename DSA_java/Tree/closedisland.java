class Solution {
    int[] x = {-1, 1, 0, 0};
    int[] y = {0, 0, -1, 1};

    public boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && j >= 0 && i < n && j < m;
    }

    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0 && visited[i][j] == 0) {
                    if (dfs(grid, visited, n, m, i, j)) {
                        res++;
                    }
                }
            }
        }

        return res;
    }

    public boolean dfs(int[][] grid, int[][] visited,
                       int n, int m, int row, int col) {

        visited[row][col] = 1;
        boolean isClosed = true;

        if (row == 0 || col == 0 || row == n - 1 || col == m - 1) {
            isClosed = false;
        }

        for (int k = 0; k < 4; k++) {
            int newrow = row + x[k];
            int newcol = col + y[k];

            if (isValid(newrow, newcol, n, m)
                    && grid[newrow][newcol] == 0
                    && visited[newrow][newcol] == 0) {

                boolean result = dfs(grid, visited, n, m, newrow, newcol);

                if (!result) {
                    isClosed = false;
                }
            }
        }

        return isClosed;
    }
}
