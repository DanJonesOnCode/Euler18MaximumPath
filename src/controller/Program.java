package controller;

import model.MaximumPath;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaximumPath m = new MaximumPath(args[0]);
		
		System.out.println(m.findMaximumPath());

	}

}
