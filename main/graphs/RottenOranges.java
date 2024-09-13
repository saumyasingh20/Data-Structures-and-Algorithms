package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
	
	//up , down, left, right
	public static int[][] DIRECTIONS = {{1,0},{-1,0},{0,-1},{0,1}};
	
	public static int minTimeForRottenOranges(int[][]grid) {
		Queue<int[]> queue = new LinkedList<>();
		//variable to keep the count of fresh oranges
		int freshOranges = 0;
		int rows=grid.length;
		int cols = grid[0].length; 
		
		//store the initial rotten oranges in queue
		for(int i=0; i<rows;i++) {
			for(int j=0; j<cols; j++) {
				if(grid[i][j]==2) {
					queue.offer(new int[] {i,j});
				}else if(grid[i][j]==1) {
					freshOranges++;
				}
			}
		}
		//no fresh oranges
		if(freshOranges==0) return 0;
		
		//do bfs to check each rotten orange
		
		int minutes=-1;
		
		while(!queue.isEmpty()) {
			int size=queue.size();
			minutes++;
			
			for(int i=0;i<size;i++) {
				int[] curr= queue.poll();
				int row= curr[0];
				int col= curr[1];
				
				//move in all directions
				for(int[] direction: DIRECTIONS) {
					int newRow= row+direction[0];
					int newCol= col+direction[1];
					
					//check if new direction is within bounds and has a fresh orange
					if(newRow>=0 && newRow<rows && newCol>=0 && newCol<cols && grid[newRow][newCol]==1) {
						//mark orange as rotten
						grid[newRow][newCol]=2;
						//add it to the queue since it is rotten now and we want to check next rotten orange because of this
						queue.offer(new int[] {newRow,newCol});
						//decrease the count of fresh oranges
						freshOranges--;
					}
					
				}
			}
		}
		
		return freshOranges==0?minutes:-1;
	}

	public static void main(String[] args) {
		 int[][] grid = {
		            {2, 1, 1},
		            {1, 1, 0},
		            {0, 1, 1}
		        };
		 System.out.println(minTimeForRottenOranges(grid));

	}

}
