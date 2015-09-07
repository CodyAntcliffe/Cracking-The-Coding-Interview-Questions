/*
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */

//The easiest way I can see to approach this, is to implement it iteratively.  To do this, we will use two pointer nodes and thus only require 1 pass through.
//Should give us an O(n) solution if correct.

public class removeElement {
	
	//Our method for returning the kth to last element of the linked list.
	public static char removeElement(linkedList L, int k){
	
		//Set both node pointers to the start of the linked list.
		linkedList head = L;
		linkedList tail = L;
		
		//Since we need the kth to last, we can first move the tail pointer k elements.
		int i = 0;
		
		while(i<k){
			//Check if k is greater than the number of elements
			if(tail.next == null){
				System.out.println("There is no element in the "+k+" to last position.");
				return ' ';
			}
			tail = tail.next;
			i++;
		}
		//Now that we have the tail pointer k elements in, we can begin to move both pointers until tail is at the end.  
		//The head pointer will then be at the kth to last node.
		
		while(tail.next != null){
			tail = tail.next;
			head = head.next;
		}
		
		//Now we can return the kth to last node
		return head.val;
	}
	
	public static void main(String[] args){
		
		linkedList myList = new linkedList('a');
		
		myList.addToLinkedList(myList, 'b');
		myList.addToLinkedList(myList, 'c');
		myList.addToLinkedList(myList, 'd');
		myList.addToLinkedList(myList, 'e');
		myList.addToLinkedList(myList, 'f');
		myList.addToLinkedList(myList, 'g');
		
		System.out.println(removeElement(myList, 2));
		
	}
}
