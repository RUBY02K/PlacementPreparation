class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {

        List<List<Integer>> adj = new ArrayList<>();

        // Create empty list for every vertex
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        for (int i = 0; i < edges.length; i++) {
            int source = edges[i][0];
            int destination = edges[i][1];

            adj.get(source).add(destination);
            adj.get(destination).add(source); // Undirected graph
        }

        return adj;
    }
}