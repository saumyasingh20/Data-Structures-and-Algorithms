package binary_trees;

public class TreeNode<T> {
	
	public T data;
	
	public TreeNode<T> left;
	
	public TreeNode<T> right;

	public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public TreeNode(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	

}
