class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int[] visited = new int [adj.size()];
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.fill(visited , 0 );
         fun( visited ,0 , adj , res);
         return res ; 
    }
    public void fun(int[]visited ,  int node ,
    ArrayList<ArrayList<Integer>>adj , ArrayList<Integer>res){
        res.add(node);
        visited[node ] = 1; 
        for(int i = 0 ; i < adj.get(node).size() ; i ++){
              int neighbour = adj.get(node).get(i);
            if(visited[neighbour] == 0){
                 fun( visited ,neighbour, adj , res);
            }
        }
    }
}