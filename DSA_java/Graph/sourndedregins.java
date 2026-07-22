class Solution {
    int x[] = { -1, 1, 0, 0 };
    int y[] = { 0, 0, -1, 1 };

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
       // First and Last Column
for (int i = 0; i < n; i++) {
    if (board[i][0] == 'O') {
        dfs(i, 0, board);
    }

    if (board[i][m - 1] == 'O') {
        dfs(i, m - 1, board);
    }
}

// First and Last Row
for (int j = 0; j < m; j++) {
    if (board[0][j] == 'O') {
        dfs(0, j, board);
    }

    if (board[n - 1][j] == 'O') {
        dfs(n - 1, j, board);
    }
}
        // Convert remaining O -> X and T -> O
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (board[i][j] == 'O')
                    board[i][j] = 'X';

                else if (board[i][j] == 'T')
                    board[i][j] = 'O';
            }
        }

    }

    public void dfs(int i, int j , char[][] board) {
        int n = board.length;
        int m = board[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m || board[i][j] != 'O')
            return;
        board[i][j] = 'T';
        for (int k = 0; k < 4; k++) {
            dfs(i + x[k], j + y[k], board);
        }

    }
}