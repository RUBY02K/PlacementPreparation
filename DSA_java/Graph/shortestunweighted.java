class Solution {
    public int shortestPath(int V, int[][] edges, int src, int dest) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph
        for (int i = 0; i < edges.length; i++) {
            int source = edges[i][0];
            int destination = edges[i][1];

            adj.get(source).add(destination);
            adj.get(destination).add(source); 
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        int[] distance = new int[V];

        Arrays.fill(distance, -1);

        q.offer(src);
        visited[src] = true;
        distance[src] = 0;

        while (!q.isEmpty()) {

            int node = q.poll();

            if (node == dest) {
                return distance[node];
            }

            for (int neighbour : adj.get(node)) {

                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    distance[neighbour] = distance[node] + 1;
                    q.offer(neighbour);
                }
            }
        }

        return -1; // Destination not reachable
    }
}