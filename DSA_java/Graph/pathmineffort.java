import java.util.*;
class Solution {

    class Pair {
        int diff;
        int x;
        int y;

        Pair(int d, int x, int y) {
            this.diff = d;
            this.x = x;
            this.y = y;
        }
    }

    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int minimumEffortPath(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        int[][] dist = new int[n][m];

        // fill with max value
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.diff - b.diff
        );

        pq.offer(new Pair(0, 0, 0));
        dist[0][0] = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.poll();

            int d = curr.diff;
            int x = curr.x;
            int y = curr.y;

            // reached destination
            if (x == n - 1 && y == m - 1) return d;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {

                    int newEffort = Math.max(
                        d,
                        Math.abs(heights[x][y] - heights[nx][ny])
                    );

                    if (newEffort < dist[nx][ny]) {
                        dist[nx][ny] = newEffort;
                        pq.offer(new Pair(newEffort, nx, ny));
                    }
                }
            }
        }

        return 0;
    }
}
