/**
 * 
 */
package bintree;

/**
 * A general purpose binary tree node
 * 
 * @author User
 */
public class TreeNode {
	
	private Object data;
	private TreeNode parent;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Object data){
		this.data = data;
	}
	
	public TreeNode(Object data, TreeNode parent){
		this.data = data;
		this.parent = parent;
	}
	
	public TreeNode(Object data, TreeNode parent, TreeNode left, TreeNode right){
		this.data = data;
		this.parent = parent;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode parent() {
		return parent;
	}

	public TreeNode left() {
		return left;
	}
	
	public TreeNode right() {
		return right;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
}
