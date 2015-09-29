/* 
 * This will be our default linkedList class
 * 
 * Contains basic linked list operations.
 */
import java.util.*;

public class linkedList {

	linkedList next; //Next node
	char val; //Our value
	//int val;
	
	//Node constructor
	 public linkedList(char v){
		 
		this.next = null;
		this.val  = v;
	}
	 
		//Node constructor
	 public linkedList(int v){
		 
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
	 
	 //Method for adding new node to end of unsorted linked list
	 public void addToLinkedList(linkedList node, int v){
		 
		 if(node.next == null){
			 node.next = new linkedList(v);
			 return;
		 }
		 else
			 addToLinkedList(node.next, v);
	 }
	
	 //Method for printing unsorted linked list
	 public void printList(linkedList L){
		 
		 if(L==null){
			 System.out.println("");
			 return;
		 }
		 System.out.print(L.val+"-->");
		 printList(L.next);
		
	 }
	 
	//Method for printing unsorted linked list
		 public void printList(){
			 
			 if(this==null){
				 System.out.println("");
				 return;
			 }
			 System.out.print(this.val+"-->");
			 printList(this.next);
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
	 
	 
	 /* LINKED LIST REVERSAL METHOD */
	 
	 //Returns the linked list, but in reverse order
	 public linkedList reverseLinkedList(){
		 if(this == null){
			 System.out.println("List is empty. Cannot reverse");
			 return this;
		 }
		 if(this.next == null){
			 System.out.println("List is only one node. Cannot reverse");
			 return this;
		 }
		 linkedList LR = null;
		 return reverseLinkedList(this,LR);
	 }
	
	private static linkedList reverseLinkedList(linkedList L, linkedList LR){
			
		//Create our reverse linked list
		linkedList temp = new linkedList(L.val);
		temp.next = LR;
		LR = temp;
					
		if(L.next!=null)
			return reverseLinkedList(L.next,LR);
		else{
			return LR;
		}
			
	}
}