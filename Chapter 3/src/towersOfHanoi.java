/*
 * 3.4
 * In the classic problem of th Towers of Hanoi, you have 3 towers and N disks of different izes which can slide onto any tower.  
 * The puzzle starts with disks sorted in ascending order of size from top to bottom (ie. each disk sits on top of an even larger one). 
 * You have the following constraints:
 * (1) Only one disk can be moved at a time.
 * (2) A disk is slide off the top of one tower onto the next tower.
 * (3) A disk can only be placed on top of a larger disk.
 * 
 * Write a program to move the disks form the first tower to the last using stacks.
 */

import java.util.*;

//This problem is basically going to have a ton of conditional statements.  Handling every possible condition is key to solving this problem.
//The main issue comes from being able to identify when the disks are stacked correctly. We will represent the disks with the integers 1,2 and 3

public class towersOfHanoi {

	stack A,B,C; //Our three stacks.
	
	public towersOfHanoi(){
		
		A = new stack(); 
		B = new stack();
		C = new stack();
		
		A.push(3);
		A.push(2);
		A.push(1);
		
	}
	
	public void makeMove(){
		
		//If B and C both empty
		if(B.isEmpty() ){
			if(!A.isEmpty()){
				if(!C.isEmpty()){
					if(C.peek())
				}
			}
		}
	}
	
	public static void main(String[] args){
		
		towersOfHanoi T = new towersOfHanoi();
		
		System.out.println(T.A.peek());
		T.makeMove();
	}
	
}
