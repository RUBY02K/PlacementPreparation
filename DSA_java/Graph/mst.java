import java.util.*;

class Solution {

    class Pair {
        int src;
        int dest;
        int weight;

        Pair(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }
    }

    public int spanningTree(int V, int[][] edges) {

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj.get(u).add(new Pair(u, v, wt));
            adj.get(v).add(new Pair(v, u, wt));
        }

        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> a.weight - b.weight);

        pq.offer(new Pair(-1, 0, 0));

        int[] visited = new int[V];

        int sum = 0;

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();

            int node = curr.dest;

            if (visited[node] == 1)
                continue;

            visited[node] = 1;

            sum += curr.weight;

            for (Pair neighbour : adj.get(node)) {

                if (visited[neighbour.dest] == 0) {
                    pq.offer(neighbour);
                }
            }
        }

        return sum;
    }
}