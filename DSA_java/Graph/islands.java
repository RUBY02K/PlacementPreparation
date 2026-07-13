class Solution {

    int[] x = {-1, 1, 0, 0};
    int[] y = {0, 0, -1, 1};

    public int numIslands(char[][] grid) {

        int res = 0;
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    dfs(grid, visited, n, m, i, j);
                    res++;
                }
            }
        }

        return res;
    }

    public boolean isvalid(int i, int j, int n, int m){
        return i >= 0 && j >= 0 && i < n && j < m;
    }

    public void dfs(char[][] grid, int[][] visited, int n, int m, int row, int col){

        visited[row][col] = 1;

        for(int k = 0; k < 4; k++){

            int newrow = row + x[k];
            int newcol = col + y[k];

            if(isvalid(newrow, newcol, n, m)
                && grid[newrow][newcol] == '1'
                && visited[newrow][newcol] == 0){

                dfs(grid, visited, n, m, newrow, newcol);
            }
        }
    }
}