package binary_trees;

public class PostOrderTraversal {
	//left => right => root
	
		public void printRootData(Integer data) {
			System.out.print(data);
		}

		public void postOrderTraverse(TreeNode<Integer> root){
	        if(root==null){
	            return;
	        }
	       postOrderTraverse(root.left);
	       postOrderTraverse(root.right);
		   printRootData(root.data);
	    }

}
