package binary_trees;

public class PreOrderTraversal {
	
	//root => left => right
	
	public void printRootData(Integer data) {
		System.out.print(data);
	}

	public void preOrderTraverse(TreeNode<Integer> root){
        if(root==null){
            return;
       }
       printRootData(root.data);
       preOrderTraverse(root.left);
       preOrderTraverse(root.right);
    }

}
