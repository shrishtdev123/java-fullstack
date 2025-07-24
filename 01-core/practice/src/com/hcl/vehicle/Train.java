package com.hcl.vehicle;

public class Train implements IVechile,IPublicTranspost {

	@Override
	public void getNumberOfPepole() {
		
		 System.out.println("300 pepeole");
		
	}

	@Override
	public void drive() {
		
		 System.out.println("train is deriving..");
		
	}

	@Override
	public void turnLeft() {
		 System.out.println(" train trun left");
		
	}

	@Override
	public void Break() {
		
		System.out.println(" train take break..");
		
	}
	
	   

}
