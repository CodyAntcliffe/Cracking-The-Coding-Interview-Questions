import java.util.HashMap;
import java.util.Map;

/*
 * 2.6 Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
 * 
 * EXAMPLE
 * Input: A->B->C->D->E->C(the same C as earlier)
 * Output C:
 * 
 */

/* 
 * We will approach this problem with two different assumptions:
 * 1. Each node has a distinct value.  
 * 2. We do not know if each node has distinct values.
 * 
 * The two assumptions differ in our approach to locating the loop.
 */
public class returnLoopStart{

	//Distinct nodes
	public static linkedList getLoopHeadDistinct(linkedList L){
		
		//We will assume distinct values in each node.  Then, we can use a map to find the loop head.
		
		Map<Character, Integer> circMap = new HashMap<Character, Integer>();
		
		//Check if the map contains node.val, if it doesn't then put it in.  If it does, then we have our loop head.
		while(!circMap.containsKey(L.val)){
			circMap.put(L.val, 1);
			L = L.next;
		}
		return L;
		
	}
	
	public static void getLoopHead(linkedList L){
		
	}
	
	public static void main(String[] args){
		//First we will make our circular linkedList
		
		linkedList myList = new linkedList('A');
		myList.addToLinkedList(myList,'B');
		myList.addToLinkedList(myList,'C');
		myList.addToLinkedList(myList,'D');
		myList.addToLinkedList(myList,'E');
		
		//Now point the last node('E') back to the 'C' node
		myList.getNode(myList, 4).next = myList.getNode(myList, 2);
		
		System.out.println(getLoopHeadDistinct(myList).val);;
		
	}
}
