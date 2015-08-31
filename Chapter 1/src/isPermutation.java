import java.util.*;
/*
 * 1.3 Given two strings, write  method to determine if one is a permutation of the other.
 */

public class isPermutation {

	public Boolean isPerm(String s1, String s2){
		//First, can do the trivial check of comparing length
		if(s1.length()!=s2.length())
			return false;
		
		
		//Most efficient way is to map a count of the occurrences of each char 'c' to that char, and then compare
		char[] charss1 = s1.toCharArray();
		char[] charss2 = s2.toCharArray();
		
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		for(char c: charss1){
			int count = 1;
			if(myMap.containsKey(c)){
				count = myMap.get(c);
				count++;
			}
			myMap.put(c,count);
		}
		
		Map<Character, Integer> myMap2 = new HashMap<Character, Integer>();
		for(char c: charss2){
			int count = 1;
			if(myMap2.containsKey(c)){
				count = myMap2.get(c);
				count++;
			}
			myMap2.put(c, count);
		}
		
		//Now that we have both strings in their respective hashmap, lets see if they match
		
		//First the case of whether the two are the same size, which would indicate one string has larger keyspace
		if(myMap.size()!=myMap2.size())
			return false;
		//Second, we can begin to compare characters in the two hashmaps
		for(char c: myMap.keySet()){
			//Do both maps contain each key?
			if(!myMap2.containsKey(c))
				return false;
			//If they do, is the mapped count equal? IE// Does the character occur with the same frequency?
			if(myMap.get(c)!=myMap2.get(c))
				return false;
		}

		//Made it here so is permutation
		return true;
	}

			
	public static void main(String[] args){
		isPermutation P = new isPermutation();
		System.out.println(P.isPerm("hello", "hhelo"));
	}
}
