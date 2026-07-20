
import java.lang.reflect.Array;
import java.util.ArrayList;

public class detectcycleundirected{
    public boolean detectcycle(int V , int [][]edges ){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean visited[] = new boolean[V];
        for(int i = 0 ; i < V ; i ++){
            adj.add( new ArrayList<>());
        }
        for(int i = 0 ; i < edges.length ; i ++){
           int source = edges[i][0];
           int destination = edges[i][1];
           adj.get(source).add(destination);
           adj.get(destination).add(source);

        }
        for(int i = 0 ; i < V ; i ++){
           return  dfs(i , adj  ,visited, -1);
        }
      return false ;
    }
   public boolean  dfs(int node, ArrayList<ArrayList<Integer>> adj,
                    boolean[] visited, int parent) {

        visited[node] = true;
        

        for (int i = 0; i < adj.get(node).size(); i++) { 
                int neighbour = adj.get(node).get(i);
           if(visited[neighbour]== true && neighbour!= parent){
            return true ; 
           }
        }
        return false ; 
    }
}