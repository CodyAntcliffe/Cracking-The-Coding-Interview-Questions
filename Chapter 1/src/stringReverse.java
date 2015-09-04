/*
 * 1.2 Implement a function void reverse(String mes) which reverses a string
 */
public class stringReverse {

	public void reverse(String mes){
		char[] reversed = new char[mes.length()];//holds reversed string characters
		for(int i=0; i<mes.length();i++){
			reversed[mes.length()-1-i] = mes.toCharArray()[i];
		}
		mes = new String(reversed);
		System.out.println(mes);
		
	}
	public static void main(String[] args){
		stringReverse s = new stringReverse();
		s.reverse("hello");
	}
}
