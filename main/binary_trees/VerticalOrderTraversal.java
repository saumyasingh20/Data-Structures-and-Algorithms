package binary_trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class VerticalOrderTraversal {
	
	  public static void populateColumnMappingViaDFS(TreeMap<Integer,List<List<Integer>>>columnVsRowValueMapping, int row, int column,
			  TreeNode<Integer> root ){
	        if(root==null){
	            return ;
	        }
	        // Add the node's value along with its row to the corresponding column in the map
	        columnVsRowValueMapping.putIfAbsent(column,new ArrayList<>());
	        List<Integer> rowVsVal = new ArrayList<>();
	        rowVsVal.add(row);
	        rowVsVal.add(root.data);
	        System.out.println("Visiting Node: " + root.data + " at row: " + row + ", column: " + column);
	        columnVsRowValueMapping.get(column).add(rowVsVal);
	        //traverse the left sub-tree
	        populateColumnMappingViaDFS(columnVsRowValueMapping,row+1,column-1,root.left);
	        //traverse the right sub tree
	        populateColumnMappingViaDFS(columnVsRowValueMapping,row+1,column+1,root.right);
	    }

	    public static List<List<Integer>> verticalTraversal(TreeNode<Integer> root) {
	        //we will store the column vs row and value mapping in this map
	        //using tree map because it will sort the key
	        TreeMap<Integer,List<List<Integer>>> columnVsRowValueMapping = new TreeMap<>();

	        populateColumnMappingViaDFS(columnVsRowValueMapping,0,0,root);

	        List<List<Integer>> verticalOrderList = new ArrayList<>();
	        for(Integer column : columnVsRowValueMapping.keySet()){

	            List<List<Integer>> rowAndValuePairList = columnVsRowValueMapping.get(column);

	            Collections.sort(rowAndValuePairList, (a,b) -> {
	                    //same row then sort by ascending order of value
	                    if(a.get(0) == b.get(0)){
	                        return a.get(1)-b.get(1);
	                    }else{
	                        return a.get(0)-b.get(0);
	                    }
	            });

	            List<Integer> sortedColumnValues = new ArrayList<>();
	            for(List<Integer> pair : rowAndValuePairList){
	                sortedColumnValues.add(pair.get(0));
	            }
	            verticalOrderList.add(sortedColumnValues);
	        }  
	        System.out.println("Final result: " + columnVsRowValueMapping);
	        return verticalOrderList;      

	    }
	
	public static void main(String[] args) {
		 TreeNode<Integer> root = new TreeNode<>(3);
	        root.left = new TreeNode<>(9);
	        root.right = new TreeNode<>(20);
	        root.right.left = new TreeNode<>(15);
	        root.right.right = new TreeNode<>(7);
	        verticalTraversal(root);
	}

}
