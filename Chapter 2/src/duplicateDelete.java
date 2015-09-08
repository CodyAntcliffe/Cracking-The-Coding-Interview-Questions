/* 
 * 2.1
 * Write code to remove duplicates from an unsorted linked-list.
 * FOLLOW UP:
 * How would you solve this problem if a temporary buffer is not allowed? 
 */

import java.util.*;

public class duplicateDelete {
	
	//Easiest way to approach this is to create hashmap and see if the node value already exists
	public void deleteDuplicates(linkedList node){

		//Then check for duplicates
		//Create hash map, and map values to it.  As you go, check if the value exists.  If yes, delete the node & continue.
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		
		linkedList prevNode = null;
		
		//Check if were at the end of the linked list
		while(node!= null){
			//If not, check if hash map already contains the value from that node. ie// check if duplicate
			if(myMap.containsKey(node.val)){
				prevNode.next = node.next;
				System.out.println("'"+node.val+"' is a duplicate. Removing from linked list...");
			}
			else {	
				//if not a duplicate, add it to hash map.  
				myMap.put(node.val, 1);
				prevNode = node;
			}
			//Move to next node in linked list.
			node = node.next;
		}
	}
	
	public static void main(String[] args){
		
		//Test linked list
		linkedList myList = new linkedList('a');
		myList.addToLinkedList(myList, 'b');
		myList.addToLinkedList(myList, 'a');
		myList.addToLinkedList(myList, 'c');
		
		System.out.println("Original Linked List");
		myList.printList(myList);
		
		duplicateDelete test = new duplicateDelete();
		test.deleteDuplicates(myList);
		System.out.println("After duplicate removal:");
		myList.printList(myList);
		
		
	}
}
