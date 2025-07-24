package com.hcl.vehicle;

public class Car extends MotorisedVehicle implements IVechile {

	@Override
	public void drive() {
		
		 System.out.println("driving");
		
	}

	@Override
	public void turnLeft() {
		
		 System.out.println("turn left");
		
	}

	@Override
	public void Break() {
		
		 System.out.println("The car is in break mode");
		
	}

	   
}
