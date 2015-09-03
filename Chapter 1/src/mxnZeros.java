/*
 * 1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to zero
 */

//The most obvious trick to this question is knowing to wait until all rows and columns are checked for a zero to see if it needs to be set to zero.
//In this case, the easiest thing to do is to check each row for a zero, and if it contains one, mark it in an array. Then add the relevant column to another.
//After the check, make your changes.  

public class mxnZeros {

	public int[][] changeMatrix(int[][] mat){
		
		//First we can check the rows and leave flags where zeros are
		Boolean[] rowCheck = new Boolean[mat.length];
		Boolean[] colCheck = new Boolean[mat[0].length];
		
		//Initialize as false so can not deal with null 
		for(int i = 0; i<mat.length; i++)
			rowCheck[i] = false;
		for(int j = 0; j<mat[0].length; j++)
			colCheck[j] = false;
	
		//Find/store where zeros are located
		for(int i=0; i<mat.length; i++){
			for(int j=0; j<mat[0].length; j++){
				if(mat[i][j]==0){
					rowCheck[i]=true;
					colCheck[j]=true;
				}
			}	
		}
		//Handle the row changes!
		for(int i=0; i<mat.length; i++){
			//if row has a zero, then change all to zero!
			if(rowCheck[i]==true){
				for(int j=0; j<mat[0].length; j++){
					mat[i][j] = 0;
				}
			}
		}
		//Handle the column changes! Opposite of row procedure...
		for(int j = 0; j<mat[0].length; j++){
			if(colCheck[j])
				for(int i=0; i<mat.length; i++){
					mat[i][j] = 0;
				}
		}
		return mat;
	}
	
	public static void main(String[] args){
		
		int[][] mat = {{0,1,0,1},{1,0,0,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};//
		mxnZeros test = new mxnZeros();
		
		mat = test.changeMatrix(mat);
		}
	}

