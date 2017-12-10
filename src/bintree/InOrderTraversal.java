/**
 * 
 */
package bintree;

/**
 * Algorithms related to In order traversal
 * 
 * @author User
 */
public class InOrderTraversal {
	
	/**
	 * Given node has been traversed, get the next node for InOrder traversal
	 * 
	 * @param node current node in traversal
	 * @return next node in traversal
	 */
	public TreeNode inOrderSuccessor(TreeNode node) {
		if(node == null) {
			return null;
		}
		TreeNode successor = null;
		
		if(node.right() != null) {
			successor = leftMostChild(node);
		} else if(node.right() == null) {
			// go up until current is the left child
			// this covers both cases, current node is left child or right child.
			// for left case we will never go in while
			TreeNode current = node;
			while(current != current.parent().left()){
				current = current.parent();
			}
			successor = current.parent();
		}
		
		return successor;
	}
	
	private TreeNode leftMostChild(TreeNode node){
		if(node == null) {
			return null;
		} else {
			TreeNode left =  leftMostChild(node.left());
			return (left == null) ? node: left;
		}
		
	}
}
