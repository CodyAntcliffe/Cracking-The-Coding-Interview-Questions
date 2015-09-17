/*
 * 3.5 
 * Implement a MyQueue class which implements a queue using two stacks.
 */

/* The easiest way to do this, is to first push all of the values onto stack A, and then push all values onto stack B */
public class MyQueue {

	stack A; //Holds the newest values
	stack B; //Holds older values
	
	public MyQueue(){
		
		A = new stack();
		B = new stack();
	}
	
	//First we need a method for joining the queue. IE// Getting to the back of the queue.
	public void enQueue(int a){
		
		if(this.A.head == 9){
			if(B.head == 0)
				makeQueue();
			else{
				System.out.println("Queue is full");
				return;
			}
		}
		A.push(a);
	}
	
	//Now we need a way to remove a value from the queue. //IE. Removing the head of the queue.
	public void deQueue(){
		
		if(B.head == 0){
			if(A.head == 0){
				System.out.println("Queue is empty!");
				return;
			}
			else
				this.makeQueue();
		}
	}
	
	//Now we need a way to move from stack A to stack B. IE//Make the two stacks into a queue.
	private void makeQueue(){
		
		if(B.head == 0 && A.head > 0){
			while(A.head != 0)
				B.push(A.pop());
		}
	}
	
	public static void main(String[] args){
		
		MyQueue M = new MyQueue();
		
		M.enQueue(1);
		M.deQueue();
	}
	
}
	
