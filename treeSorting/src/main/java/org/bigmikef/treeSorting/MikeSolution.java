package org.bigmikef.treeSorting;

import java.util.ArrayList;
import java.util.List;

public class MikeSolution {

	public static void breadthFirstSearch(TreeNode treeNode) {
		if (treeNode == null) {
			return;
		}
		helper(treeNode, new ArrayList<TreeNode>());
	}
	
	private static void helper(TreeNode currentNode, List<TreeNode> listToVisit) {
		System.out.print(currentNode.getValue());
		TreeNode leftChild = currentNode.getLeftChild();
		if (leftChild != null) {
			listToVisit.add(leftChild);
		}
		
		TreeNode rightChild = currentNode.getRightChild();
		if (rightChild != null) {
			listToVisit.add(rightChild);
		}
		
		if (!listToVisit.isEmpty()) {
			TreeNode nextNode = listToVisit.remove(0);
			helper(nextNode, listToVisit);
		}
	}
}
