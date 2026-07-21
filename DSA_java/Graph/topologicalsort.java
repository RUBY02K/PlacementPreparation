class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<Integer> res = new ArrayList<>(V);
       int [] indegree = new int[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i< V ; i ++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0 ; i < edges.length; i++){
            int source = edges[i][0];
            int destination = edges[i][1];
            adj.get(source).add(destination);
            indegree[destination]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i< V; i ++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        while (!q.isEmpty()){
            int node = q.poll();
             res.add(node);
            for(int i = 0 ; i < adj.get(node).size(); i++){
            int neighbour = adj.get(node).get(i);
            indegree[neighbour]-- ; 
            if(indegree[neighbour]==0){
                q.offer(neighbour);
            }
            }
        }
        return res ;
    }
}