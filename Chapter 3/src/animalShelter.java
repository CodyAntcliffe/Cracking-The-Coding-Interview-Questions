import java.util.LinkedList;

/*
 * 3.7
 * An animal shelter holds only dogs and cats, and operates on a strictly "first in, first out" basis.  People must adopt either the "oldest" 
 * (based on arrival time) of all animals at the shelter, or they can select whether they would prefer a dog or a cat(and will receive the 
 * oldest animal of that type).  They cannot select which specific animal they would like.  
 * Create the data structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog and dequeueCat.  
 * You may use the built-in LinkedList data structure.
 */


public class animalShelter {

	MyQueue cats;
	MyQueue dogs;
	int nextAnimal;//The next ID to be used by the system.
	
	LinkedList animals = new LinkedList();
	
	//ID can be either 1 for Cat, or 2 for Dog.
	public void enqueue(int ID){
		
		if(ID != 1 && ID!= 2){
			System.out.println("Invalid ID.  Use ID=1 for Cat, or ID=2 for Dog.");
			return;
		}
		if(ID == 1){
			cats.enQueue(nextAnimal);
			nextAnimal++;
		}
		if(ID == 2){
			dogs.enQueue(nextAnimal);
			nextAnimal++;
		}
	}
	
	//Dequeues the "oldest" animal, either Dog or Cat.
	public void dequeueAny(){
		
		if(dogs.B.peek() <  cats.B.peek()){
			
		}
	}
	
	//Dequeues the oldest Dog 
	public void dequeueDog(){
		
	}
	//Dequeues the oldest Cat
	public void dequeueCat(){
		
	}
	public static void main(String[] args){
		
		animalShelter test = new animalShelter()
		
	}
}
