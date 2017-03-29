package model;

public class PyramidArray {
	// constructor
	public PyramidArray(int[] source) {
		// Checking if the array passed in will work as a pyramid
		if(MathUtilities.isNumberTriangular(source.length)) {
			buildPyramid(source);
		} else {
			System.out.println("The array passed in cannot construct a pyramid as it's length is not a  triangular number.");
		}
	}
	
	// This is the pyramid object that the class constructs and interacts with
	private int[][] pyramid;
	
	private void buildPyramid(int[] source) {
		int triangleHeight = (int) MathUtilities.getTriangleHeight(source.length);
		this.pyramid = new int[triangleHeight][];
		int sourcePos = 0;
		
		// Cycling through each row in the triangle and building the pyramid
		for(int i = 0; i < triangleHeight; i++) {
			this.pyramid[i] = new int[i + 1];
			for(int j = 0; j < i + 1; j++) {
				
				this.pyramid[i][j] = source[sourcePos];
				sourcePos++;
			}
		}
	}	
	
	public int[][] getPyramid() {
		return this.pyramid;
	}
	
	public void setNewLine(int row, int[] newLine) {
		for(int i = 0; i < newLine.length; i++) {
			this.pyramid[row][i] = newLine[i];
			
		}
		
	}
	

}
