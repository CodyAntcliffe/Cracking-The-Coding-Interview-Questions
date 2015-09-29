import java.util.Arrays;

/*
 * 1.5 Implement a method to perform basic string compression using the counts of repeated characters. For example,
 *  the string 'aabcccccaaa' would become a2b1c5a3.  If the "compressed" string would not become smaller than the original string, 
 *  your method should return the original string.
 */

public class stringCompression {

	public String compressString(String s){
		
		//Handle the case where it couldn't possibly get smaller
		if(s.length()<=2){
			return s;
		}
		
		//First change string to char array
		char[] array = s.toCharArray();
		String newString = "";
	
		//Compress
		for(int i=0; i<s.length(); i++){
			int count = 1;
			while(i+1<s.length() && array[i]==array[i+1]){
				count++;
				i++;
			}
			newString+=array[i];
			newString+=count;	
		}
		
		//Check if the "compressed" string would become smaller than the original string.
		if(newString.length()<s.length())
			return newString;
		//Return original string if not.
		else
			return s;
	}
	
	public static void main(String[] args){
		stringCompression s = new stringCompression();
		System.out.println(s.compressString("aaabbcccccca"));
	}
}
