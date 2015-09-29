/*
 * 3.3 
 * 	 Imagine a (literal) stack of plates.  If the stack gets too high, it might topple. Therefore, in real life,we would likely start a 
 * 	 new stack when the previous stack exceeds some threshold. Implement a data structure called SetOfStacks that mimics this. 
 *   SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity. 
 *   SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack(that is, pop() should return the 
 *   same values as it would if there were just a single stack).
 *   
 * FOLLOW UP
 * 
 * 	 Implement a popAt(int index) which performs a pop operation on a secific sub-stack.
 */


public class SetOfStacks {

	stack[] stackSet; //Collection of stacks
	int current; //Pointer to the current stack we are working with
	
	public SetOfStacks(){
		
		stackSet = new stack[10];//Max number of stacks in our stackSet
		current = 0;
	}
	
	public void push(int data){
		
		//Check if current>max
		if(current>9){
			//If it is, say that it is now full. Recommend creating a new SetOfStacks
			current --;
			System.out.println("SetOfStacks is full. Create new SetOfStacks");
			return;
		}
		
		//Null Check
		if(stackSet[current] == null){
			stackSet[current] = new stack();
		}
		
		//Need to check which stack current is pointing to
		//Check whether it is full
		if(stackSet[current].head == 9){
			//If it is, increment current
			current++;
			
			//Restart the method call since we need to create the new stack
			this.push(data);
		}
	
		//If we made it here, then push the data onto the current stack
		if(current<10){
			stackSet[current].push(data);
		}
		
		return;
	}
	
	//Pops the right-most(current)stack
	public int pop(){
		
		//Handle current == -1 case
		if(stackSet[0] == null || current == -1){
			current = 0;
			System.out.println("Stack set is empty. Cannot Pop!");
			return 0;
		}
		if(stackSet[current].head == 0){
			current--;
			return pop();
		}
		
		System.out.println(stackSet[current].peek());
		
		return stackSet[current].pop();
	}
	
	//Pops the stack located at a specific index
	public int popAt(int index){
		
		//Check if index is valid
		if(index<0 || index>current){
			System.out.println("No stack at index = "+index);
			return -1;
		}
		
		System.out.println(stackSet[index].peek());
		
		return stackSet[index].pop();
	}
	
	public static void main(String[] args){
		
		SetOfStacks S = new SetOfStacks();
	
		//Values mean nothing.  Assumes max = 9.
		for(int i = 0; i<82; i++){
			S.push(i);
		}
		
		S.popAt(1);
		S.popAt(10);
		
		for(int i = 0; i<82; i++){
			S.pop();
		}
	}
}
