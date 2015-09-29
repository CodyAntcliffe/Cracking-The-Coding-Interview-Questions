import java.util.Arrays;
/*
 * 
 * 1.4 Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at end of the string
 *  to hold additional characters, and that you are given the "true" length of the string. If implementing in java, please use char array to perform
 *  operation in place.
 * 
 */
public class replaceCharInString {
	/*Take one step further, and allowed it to be implemented using any character! Not just space.*/
	//Takes three inputs: the string(as a char array), the char to replace, and the true length of the string
	public void replaceChar(char[] s, char rep, int length){
		
		//**Now that easiest thing to do would be to create a new char array and simply put the chars from s in, and replace
		//spaces with '%20'.  However, we're going to do this with just the original array.**
		
		//First things first, we need the ending length of the resulting charArray.  This can be found using the frequency of rep.
		int Count = 0;
		for(int i=0; i<length; i++){
			if(s[i]==rep)
				Count++;
		}
		
		//Now, we can use simple arithmetic to get the length of the ending charArray
		int endLength = length + (Count*2); // Only need two additional spaces since the space already gives us the third
		
		//Now that we have the ending length of the array, we can work backwards and replace 'rep' with '%20'
		for(int i = length-1; i>=0; i--){
			if(s[i]==rep){
				s[endLength-1]='0';
				s[endLength-2]='2';
				s[endLength-3]='%';
				endLength-=3;
			}
			else{
				s[endLength-1]=s[i];
				endLength--;
			}
		}
			System.out.print(Arrays.toString(s));
	}
	
	public static void main(String[] args){
		replaceCharInString a = new replaceCharInString();
		char[] s = {'H','E','L','L','O',' ',' ','W','O','R','L','D',' ',' ',' ',' '}; //Since we assume it has sufficient space at the end
		a.replaceChar(s,' ',12);
	}
}
