class Solution {
	public boolean isCyclic(int V, int[][] edges) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for (int i = 0 ; i < V ; i++) {
			adj.add(new ArrayList<>());
		}
		for (int i = 0 ; i < edges.length; i++) {
			int source = edges[i][0];
			int destination = edges[i][1];
			adj.get(source).add(destination);
		}
		boolean visited [] = new boolean [V];
		boolean path [] = new boolean [V];
		
		for (int i = 0; i < V; i++) {
			if (!visited[i]) {
				if( dfs(i, edges, adj, visited, path))
				return true ;
			}
		}
		return false ;
	}
	public boolean dfs(int node, int edges[][], ArrayList<ArrayList<Integer>> adj, boolean []visited, boolean []path) {
		visited[node] = true ;
		path[node] = true ;
		for (int i = 0 ; i < adj.get(node).size(); i++) {
			int neighbour = adj.get(node).get(i);
			if (visited[neighbour] == true && path[neighbour] == true) {
				return true ;
			}
			else {
				if (!visited[neighbour]) {
					if (dfs(neighbour, edges, adj, visited, path))
						return true ;
				} }
				
			}
			path[node] = false ;
			return false ;
		}
	}
