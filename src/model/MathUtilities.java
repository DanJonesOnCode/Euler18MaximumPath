package model;

public class MathUtilities {
	
	public static boolean isNumberTriangular(int num) {
		double triangleHeight = getTriangleHeight(num);
		
		// if the number returned from getTriangleHeight is a whole number the value passed in is triangular
		if(Math.floor(triangleHeight) == triangleHeight) {
			return true;
		}
		
		return false;
	}
	
	public static int getTriangularNumber(int triangleHeight) {
		
		return((triangleHeight * (triangleHeight + 1)) / 2);
	}
	
	public static double getTriangleHeight(int valueCount) {
		double retval = 8 * valueCount + 1;
		retval = Math.sqrt(retval);
		retval = retval - 1;
		retval = retval / 2;
		
		return retval;
	}

}
