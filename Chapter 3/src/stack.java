
/*
 * Implementation of Stack.
 */

public class stack {

	int[] values; //Holds our values
	int head; //The 'top' of the stack

	
	public stack(){
		
		this.values = new int[10];
		this.head = 0;
	}
	
	//Pushes a new value onto the stack
	public void push(int a){
		
		if(head == 9){
			System.out.println("Stack Full, Cannot Push");
			return;
		}
		this.values[head] = a;
		this.head++;
	}
	
	//Removes and returns the top of the stack
	public int pop(){
		
		if(head == 0){
			System.out.println("Stack Empty!");
			return 0;
		}
		
		head --;
		//System.out.println(this.values[head]);
		return this.values[head];
	}
	
	//Returns the top of the stack without popping
	public int peek(){
		
		return this.values[head-1];
	}
	
}
