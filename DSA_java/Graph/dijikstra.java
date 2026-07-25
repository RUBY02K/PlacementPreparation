public class dijikstra {
    import java.util.*;

class Solution {

    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public int networkDelayTime(int[][] times, int n, int k) {

        // Adjacency List
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            // Directed Graph
            adj.get(u).add(new Pair(v, w));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> a.weight - b.weight
        );

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[k] = 0;
        pq.add(new Pair(k, 0));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();

            int node = curr.node;
            int wt = curr.weight;

            if (wt > dist[node]) continue;

            for (Pair nbr : adj.get(node)) {

                if (wt + nbr.weight < dist[nbr.node]) {

                    dist[nbr.node] = wt + nbr.weight;
                    pq.add(new Pair(nbr.node, dist[nbr.node]));
                }
            }
        }

        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE)
                return -1;

            ans = Math.max(ans, dist[i]);
        }

        return ans;
    }
}
}
