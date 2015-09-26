/*
 * Node class for the Binary Tree data structure.
 */

public class BinTreeNode {

	BinTreeNode left;
	BinTreeNode right;
	int data;
	
	public BinTreeNode(int v){
		
		this.data = v;
		this.left = null;
		this.right = null;
	}
	
	public void addToTree(int v){
		
		if(v<this.data){
			if(this.left == null){
				this.left = new BinTreeNode(v);
			}
			else
				left.addToTree(v);
			return;
		}
		if(v>this.data){
			if(this.right == null){
				this.right = new BinTreeNode(v);
			}
			else
				right.addToTree(v);
			return;
		}
	}
	
	public void printTree(){

	}
	public static void main(String[] args){
		
		BinTreeNode Tree = new BinTreeNode(10);
		
		
	}
}
