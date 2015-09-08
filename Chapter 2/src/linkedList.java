/* 
 * This will be out default linkedList class
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
}