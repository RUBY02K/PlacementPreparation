class Solution {

    class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    int[] x = {-1, 1, 0, 0};
    int[] y = {0, 0, -1, 1};

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        Queue<Pair> q = new LinkedList<>();

        int fresh = 0;
        int time = 0;

        // Store all rotten oranges in queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j));
                }

                else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // BFS
        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();
            time++;

            while (size-- > 0) {

                Pair p = q.poll();

                int r = p.i;
                int c = p.j;

                for (int k = 0; k < 4; k++) {

                    int nr = r + x[k];
                    int nc = c + y[k];

                    if (isValid(nr, nc, n, m) && grid[nr][nc] == 1) {

                        grid[nr][nc] = 2;
                        fresh--;

                        q.offer(new Pair(nr, nc));
                    }
                }
            }
        }

        return fresh == 0 ? time : -1;
    }

    boolean isValid(int i, int j, int n, int m) {

        if (i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        }

        return true;
    }
}