/*
 * 3.2 How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element?
 *  Push, pop and min should all operate in O(1) time.
 */

//There is no way to solve this problem with a single stack.  Even if we kept a variable called minimum which had the smallest value in
//the stack, if we were to pop this value from our stack then we would no longer know what the new minimum is.

//Push and Pop all operate in O(1) time already, so it is just a matter of implementing min().  
//We can do this by making a second stack which, as values are pushed onto the man stack, are pushed onto the minimum stack if 
//the value is less than, or equal to, the top value of the minimum stack.  This way the smallest value will always be on the top.

public class stackMinimum {

	stack S;
	stack minimum;
	
	public stackMinimum(){
		this.S = new stack();
		this.minimum = new stack();
	}
	
	//Pushes a new value onto the stack
		public void push(int a){
			
			if(this.S.head == 99){
				System.out.println("Stack Full, Cannot Push");
				return;
			}
			
			if(this.minimum.head == 0 || a <= this.minimum.peek()){
				this.minimum.values[this.minimum.head] = a;
				this.minimum.head++;
			}
			
			this.S.push(a);
		}
		
		//Removes and returns the top of the stack
		public int pop(){
			
			if(this.S.head == 0){
				System.out.println("Stack Empty!");
				return 0;
			}
			if(this.minimum.values[this.minimum.head-1] == this.S.peek()){
				this.minimum.pop();
			}
			return this.S.pop();
		}
	
	public int getMin(){
		System.out.println("Minimum value in stack: "+this.minimum.peek());
		return this.minimum.peek();
	}
	
		public static void main(String[] args){
			stackMinimum SM = new stackMinimum();
			SM.push(3);
			SM.push(2);
			SM.push(1);;
			
			SM.getMin();
			SM.pop();
			SM.getMin();
			
		}
}
