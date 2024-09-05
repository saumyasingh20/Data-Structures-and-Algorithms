package binary_trees;

public class InOrderTraversal {
	//left => root => right
	
	public void printRootData(Integer data) {
		System.out.print(data);
	}

	public void inOrderTraverse(TreeNode<Integer> root){
	  if(root==null){
	       return;
	    }
	 printRootData(root.data);
	 inOrderTraverse(root.left);
	 inOrderTraverse(root.right);
	 
	}
}
