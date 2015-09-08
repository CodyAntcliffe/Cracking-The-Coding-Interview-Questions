/* 
 * This will be our default linkedList class
 * 
 * Contains basic linked list operations.
 */
import java.util.*;

public class linkedList {

	linkedList next; //Next node
	char val; //Our value
	
	//Node constructor
	 public linkedList(char v){
		 
		this.next = null;
		this.val  = v;
	}
	 
	 //Method for adding new node to end of unsorted linked list
	 public void addToLinkedList(linkedList node, char v){
		 
		 if(node.next == null){
			 node.next = new linkedList(v);
			 return;
		 }
		 else
			 addToLinkedList(node.next, v);
	 }
	
	 //Method for printing unosrted linked list
	 public void printList(linkedList L){
		 
		 if(L==null){
			 System.out.println("");
			 return;
		 }
		 System.out.print(L.val+"-->");
		 printList(L.next);
		
	 }
	 
	 //Returns a specific node from our Linked List
	 public linkedList getNode(linkedList head, int index){
		 if(index < 0){
				System.out.println("Please select an index >= 0");
				return null;
			}
		 
		 int i = 0;
		 while(i < index){
			 if(head.next == null){
				 System.out.println("Node at index '"+index+"' does not exist.");
				 return null;
			 }
			 head = head.next;
			 i++;
		 }
		 return head;
	 }
}