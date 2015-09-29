/*
 * 2.5 You have two number represented by a linked list, where each node contains a single digit.  The digits are stored in reverse order, 
 * such that the 1's digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
 */

public class addListsReverse {
	
	static linkedList addListsReverse(linkedList a, linkedList b, int carry, linkedList sum){
		//The easiest way to approach this is to use recursion.  We will iterate through a&b, and add the two values together.  This value
		//will occupy the node in sum of the opposite position.  IE// nodes 1 will sum to fill node 3 of 'sum' linked list.
		//If the sum of the two values is two digits, simply subtract 10 and use the carry in the next method call. Since both are 1 digit, it can
		//never be more than a 1 carry.
		
	
		//Check if the two are null.  If so, return the sum linkedList since we are done summing.
		if(a == null && b == null){
			return sum;
		}
		
		//Begin our current value with the current carry.
		int val = carry;
		
		//Since we need to add the nodes as if they were in reverse order, we can start by adding the first two of each		
		//But we need to check if the nodes are empty		
		if(a != null){
			val += a.val;
			a = a.next;
		}
		
		if(b != null){
			val += b.val;
			b = b.next;
		}
		
		//Handle a double-digit scenario(carry scenario)
		if(val > 9){
			val = val - 10;
			carry = 1;
		}
		else
			carry = 0;
		
		//Make the temp node that holds the resulting value
		linkedList result = new linkedList(val);
		
		//Since we want reverse order, result becomes the head of the sum linked list.
		result.next = sum;
		sum = result;
		
		//Recursive call
		return addListsReverse(a, b, carry, sum);
		
	}
	
	public static void main(String[] args){
		linkedList a = new linkedList(7);
		a.addToLinkedList(a, 1);
		a.addToLinkedList(a, 6);
		
		linkedList b = new linkedList(5);
		b.addToLinkedList(b, 9);
		b.addToLinkedList(b, 2);
	
		linkedList sum = null;
		sum = addListsReverse(a,b,0, sum);
		
		sum.printList();
	}
}
