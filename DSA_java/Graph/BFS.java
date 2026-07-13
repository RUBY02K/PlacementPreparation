class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {

        int n = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();

        int[] visited = new int[n];

        Queue<Integer> q = new LinkedList<>();

        q.offer(0);
        visited[0] = 1;

        while (!q.isEmpty()) {

            int node = q.poll();
            ans.add(node);

            for (int i = 0; i < adj.get(node).size(); i++) {

                int neighbour = adj.get(node).get(i);

                if (visited[neighbour] == 0) {
                    visited[neighbour] = 1;
                    q.offer(neighbour);
                }
            }
        }

        return ans;
    }
}