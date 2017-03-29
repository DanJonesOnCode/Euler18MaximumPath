package model;

public class MaximumPath {
	
	public int[] sourceData;
	
	public MaximumPath(String sourceString) {
		String[] stringArray = sourceString.split(" ");
		sourceData = new int[stringArray.length];
		for(int i = 0; i < stringArray.length; i++) {
			
			sourceData[i] = Integer.parseInt(stringArray[i]); 
			
		}
	}
	
	public int findMaximumPath() {
		
		PyramidArray p = new PyramidArray(sourceData);
		int[] newLineArray;
		for(int i = p.getPyramid().length - 1; i >= 0; i--) {
			newLineArray = new int[i];
			for(int j = 0; j < i; j++) {
				
				int val1 = p.getPyramid()[i - 1][j] + p.getPyramid()[i][j];
				int val2 = p.getPyramid()[i - 1][j] + p.getPyramid()[i][j + 1];
				
				newLineArray[j] = Math.max(val1, val2);
				
			}
			
			p.setNewLine(i - 1, newLineArray);
			
		}
		
		return p.getPyramid()[0][0];
	}
}
