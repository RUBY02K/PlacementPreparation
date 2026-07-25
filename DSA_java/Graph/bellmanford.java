import java.util.Arrays;

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {

        int[] res = new int[V];
        Arrays.fill(res, (int)1e8);
        res[src] = 0;

        // Relax all edges V-1 times
        for (int i = 0; i < V - 1; i++) {

            for (int j = 0; j < edges.length; j++) {

                int u = edges[j][0];
                int v = edges[j][1];
                int wt = edges[j][2];

                if (res[u] != (int)1e8 && res[v] > res[u] + wt) {
                    res[v] = res[u] + wt;
                }
            }
        }

        // Check for negative weight cycle
        for (int j = 0; j < edges.length; j++) {

            int u = edges[j][0];
            int v = edges[j][1];
            int wt = edges[j][2];

            if (res[u] != (int)1e8 && res[v] > res[u] + wt) {
                return new int[]{-1};
            }
        }

        return res;
    }
}