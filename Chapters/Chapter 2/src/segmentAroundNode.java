/*
 * Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater than or equal to x.
 */

//The solution to this problem is very straight forward.  Divide the linked list into two separate lists based on the value in each node.  Then combine
//the two resulting linked lists.

public class segmentAroundNode {

	static linkedList segmentList(linkedList L, char partition){
		
		//Check for null linkedList
		if(L == null || L.next == null){
			System.out.println("Cannot segment list!");
			return L;
		}
	
		//We will use two linkedLists for this
		linkedList lessList = null;
		linkedList greaterList = null;
		
		//Now, divide the nodes based on partition value
		while(L!=null){
			//Need to hold the rest of the list, minus the value we're working with
			linkedList temp = L.next;
			
			//Now, simply add node to the beginning of the correct list. 
			if(L.val < partition){
				L.next = lessList;
				lessList = L;
			}
			else{
				L.next = greaterList;
				greaterList = L;
			}
			
			//Now, set node back to the temp holder
			L = temp;
		}
		
		//Check if greaterList is null.  If it is we can finish more efficiently
		if(greaterList == null){
			return lessList;
		}
		//Now, if lessList is null, we can simply return greaterList
		if(lessList == null){
			return greaterList;
		}
		
		//Now, we need to combine the two lists
		//set L back to lessList
		L = lessList;
		
		//Iterate to the end of lessList
		while(lessList.next != null)
			lessList = lessList.next;
		
		//Combine the two lists
		lessList.next = greaterList;
		
		return L;
	}//End of method
		
		
	public static void main(String[] args){
		
		linkedList myList = new linkedList('a');
		myList.addToLinkedList(myList, 'b');
		myList.addToLinkedList(myList, 'c');
		myList.addToLinkedList(myList, 'd');
		myList.addToLinkedList(myList, 'f');
		myList.addToLinkedList(myList, 'g');
		myList.addToLinkedList(myList, 'h');
		
		linkedList segment = segmentList(myList, 'e');
		segment.printList();
	
	}
}
