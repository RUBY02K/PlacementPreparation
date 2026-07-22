package DSA_java.Graph;

import java.util.Arrays;

public class bipartite {
    class Solution {
    boolean res = true ; 
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[]colors = new int[n];
        Arrays.fill(colors , -1);
        for(int i = 0 ; i< n ; i ++){
            if(colors[i]== -1){
                dfs(i , graph ,0 , colors );
            }
        }
      return res ; 
    }
    public void dfs ( int node ,int graph[][] , int c , int[]colors )
    {  
      colors[node]= c ;
      for(int i = 0 ; i < graph[node].length ; i++){
        int neighbour = graph[node][i];
        if(neighbour != -1 && colors[neighbour]== c){
            res = false ; 
        }
         if(colors[neighbour]== -1){
            dfs(neighbour , graph , 1-c , colors);
        }
      }
      
    }
}
    
}
