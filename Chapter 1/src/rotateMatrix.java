/*
 * Given an image represented by an NxN matrix, where each pixel is 4 bytes, write a method to rotate the image by 90 degrees.  
 * Can you do this in place?
 * 
 */
public class rotateMatrix {
	
	//Method to print the matrix.  Used for texting purposes
	public static void printMat(int[][] mat){
		System.out.println("");
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat.length; j++){
				int current = mat[i][j];
				System.out.print(current+" ");
			}
			System.out.println("");
		}
	}
	
	public static int[][] matrixRotation(int[][] p){
	
		//Without doing it in place, we can create a second NxN matrix with the same dimensions as p 
		int[][] second = new int[p.length][p.length];
	
		for(int row=0; row<p.length; row++){
			for(int col=0; col<p.length; col++){
				
				int current = p[row][col]; //The current int 
				second[col][3-row] = current;	
			}
		}
		return second;

	}
	
	public static void main(String[] args){
		int[][] picture = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		
		printMat(picture);
		rotateMatrix test = new rotateMatrix();
		picture = test.matrixRotation(picture);
		printMat(picture);
	}
}
