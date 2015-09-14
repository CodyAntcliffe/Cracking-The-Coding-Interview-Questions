/*
 * 2.7 Implement a function to check if a linked List is a palindrome.
 */

//A palindrome is a sequence that is identical to itself if reversed.  Ie// ABCBA and 12344321
//Knowing this, if is EXTREMELY easy to solve this problem.

//We will simply take our linked list, create a reverse version of it, and compare the two lists.

public class isPalindrome {
	
	public static void checkPalindrome(linkedList L){
		
		//Null check
		if(L == null){
			System.out.println("List is empty, cannot be palindrome!");
			return;
		}
		
		//Create our reverse linked list
		linkedList reverse = L.reverseLinkedList();
		
		//Now iteratively check to see if the lists match
		while(L!=null){
			if(L.val == reverse.val){
				L = L.next;
				reverse = reverse.next;
			}
			else{
				System.out.println("List is not a palindrome!");
				return;
			}
		}
		System.out.println("List is a palindrome!");
		return;
	
	}

	public static void main(String[] args){
		
		//First create your linked List
		linkedList myList = new linkedList('A');
		myList.addToLinkedList(myList,'B');
		myList.addToLinkedList(myList,'C');
		myList.addToLinkedList(myList,'B');
		myList.addToLinkedList(myList,'A');
		
		checkPalindrome(myList);
		
	}
}
