/*
 * 3.6
 * Write a program to sort a stack in ascending order(with biggest items on top).  You may use at most one additional stack to hold items,
 * but you may not copy the elements into any other data structures(such as an array).
 * The stack supports the following operations: push,pop,peek, and isEmpty.
 */

/* The easiest way to do this would be to use a third stack. Unfortunately, the problem does not allow this. */
/*Instead, I will assume we can use a temp variable to hold a current value.*/

public class ascendingSort extends stack {

	//Method for sorting in ascending order
	public static void sortAscending(stack S, stack S2){
		//Check if both stacks empty. Ie.// Nothing to sort
		if(S.isEmpty() && S2.isEmpty()){
			System.out.println("Both stacks are empty");
			return;
		}
		//Check if our soon to be sorted stack is empty
		if(S2.isEmpty())
			S2.push(S.pop());
		
		//Put top of unsorted stack into temp
		int temp = S.pop();
		
		//Now, we need to find where to push temp onto the sorted stack
		while(S2.peek()>temp && !S2.isEmpty()){
			S.push(S2.pop());
		}
		
		S2.push(temp);
		
		//Check if we have completed the sorting
		if(S.isEmpty()){
			return;
		}
		else
			sortAscending(S,S2);
	}
	
	
	/* For fun, lets also have the ability to sort in descending order */
	//Method for sorting in descending order
		public static void sortDescending(stack S, stack S2){
			//Check if both stacks empty. Ie.// Nothing to sort
			if(S.isEmpty() && S2.isEmpty()){
				System.out.println("Both stacks are empty");
				return;
			}
			//Check if our soon to be sorted stack is empty
			if(S2.isEmpty())
				S2.push(S.pop());
			
			//Put top of unsorted stack into temp
			int temp = S.pop();
			
			//Now, we need to find where to push temp onto the sorted stack
			while(S2.peek()<temp && !S2.isEmpty()){
				S.push(S2.pop());
			}
			
			S2.push(temp);
			
			//Check if we have completed the sorting
			if(S.isEmpty()){
				return;
			}
			else
				sortDescending(S,S2);
		}
	
	//Used for testing purposes
	public static void printStack(stack S){
		
		if(S.isEmpty()){
			System.out.println("Stack empty");
			return;
		}
		while(!S.isEmpty()){
			System.out.println(S.pop());
		}
			
	}
	
	public static void main(String[] args){
		
		stack unsortedStack = new stack();
		unsortedStack.push(9);
		unsortedStack.push(3);
		unsortedStack.push(1);
		unsortedStack.push(5);
		unsortedStack.push(2);
		
		stack sortedStack = new stack();
		
		sortAscending(unsortedStack, sortedStack);
		printStack(unsortedStack);
		printStack(sortedStack);

		
	}
}
