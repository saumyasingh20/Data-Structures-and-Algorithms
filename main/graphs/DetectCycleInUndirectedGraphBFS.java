package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInUndirectedGraphBFS {
	
	 // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        
        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[V];
        
        //traverse from the starting node for connected components case
        for(int startingNode = 0; startingNode<V;startingNode++){
        	//check if the starting node is visited and initiate a bfs 
             if(!visited[startingNode]){
                 visited[startingNode]=true;
                 queue.add(new int[]{startingNode,-1});
                 
                while(!queue.isEmpty()){
	                int[] nodeVsParent = queue.poll();
	                int node = nodeVsParent[0];
	                int parent = nodeVsParent[1];
	                for(Integer neigbour : adj.get(node)){
	                	//if a neighbor is visited and not the parent then cycle is detected
	                    if(visited[neigbour]){
	                        if(neigbour!=parent){
	                            return true;
	                        }
	                     }else{
	                        visited[neigbour]=true;
	                        queue.add(new int[]{neigbour,node});
	                        }
	                    }
               }
             }
        
            
        }
        return false;
    }

}
