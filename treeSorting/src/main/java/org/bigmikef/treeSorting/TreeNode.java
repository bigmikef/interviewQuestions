package org.bigmikef.treeSorting;

public final class TreeNode {

	private TreeNode rightChild;
	private TreeNode leftChild;
	private String value;
	
	public TreeNode(String value, TreeNode leftChild, TreeNode rightChild) {
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.value = value;
	}
	
	public TreeNode(String value) {
		this.value = value;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
