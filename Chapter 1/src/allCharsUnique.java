/*
 * 
 * 1.1 - Implement an algorithm to determine if all chars are unique in a string.
 */

public class allCharsUnique {
	String message = "abcdefghf";
	
	public Boolean isUnqiue(String mes){
		/*if we can assume all chars are between 'a' and 'z', then we can simply do the following trival solution:
			 * if(mes.length>=26)
			 * 		return false;
			 * 
		 */
		int val;

		for(int i=0; i<mes.length(); i++){
			val = mes.toCharArray()[i];
			for(int j=i+1; j<mes.length();j++){
				if(mes.toCharArray()[j]==val){
					System.out.println("Not all characters are unique");
					//Can quit since not all are unique
					return false;
				}
			}
		}
		System.out.println("All chars unique!");
		return true;
		
	}
	public static void main(String[] args){
		allCharsUnique a = new allCharsUnique();
		a.isUnqiue(a.message);
	}
}
