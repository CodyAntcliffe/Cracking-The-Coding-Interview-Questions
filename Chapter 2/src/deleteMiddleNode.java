/*
 * 2.3 Implement an algorithm to delete a nde in the middle of a singly linked list, given only access to that node.
 */

//The solution to this problem deals with the fact that we don't have access to the head of the linked list, and thus don't have access to the node before
//the node that is to be deleted.  This means we need to approach this in a slightly modified way.
public class deleteMiddleNode {

	public static void deleteMiddleNode(linkedList node){
		//First do checks
		if(node == null){
			System.out.println("Cannot complete operation.\n");
			return;
		}
		//Cannot perform this on the last node of the linked list since there is no node following it
		if(node.next == null){
			System.out.println("Cannot delete last node using this method");
			return;
		}
		
		//Our approach will be to move the proceeding nodes back, rather than the simple node delete method. I believe this is an O(1) solution.
		node.val = node.next.val;
		node.next = node.next.next;
	}
	
	public static void main(String[] args){
		
		linkedList myList = new linkedList('a');
		
		myList.addToLinkedList(myList, 'b');
		myList.addToLinkedList(myList, 'c');
		myList.addToLinkedList(myList, 'd');
		myList.addToLinkedList(myList, 'e');
		myList.addToLinkedList(myList, 'f');
		myList.addToLinkedList(myList, 'g');
		
		myList.printList(myList);
		System.out.println();
		
		deleteMiddleNode(myList.getNode(myList, 5));
		myList.printList(myList);
		
		
	}
}
