class Solution {
    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;
        boolean[] visited = new boolean[n];

        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                bfs(i, isConnected, visited);
                provinces++;
            }
        }

        return provinces;
    }

    public void bfs(int src, int[][] graph, boolean[] visited) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        visited[src] = true;

        while (!q.isEmpty()) {

            int node = q.poll();

            for (int j = 0; j < graph.length; j++) {

                if (graph[node][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    q.offer(j);
                }
            }
        }
    }
}