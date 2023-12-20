package com.demo;

public class Child extends Test{

	@Override
	void display() {
		System.out.println("display");
		
	}
	
	void childDisplay() {
		System.out.println("childDisplay");
	}
	
	public static void main(String[] args) {
		Test obj = new Child(); //same method 
		
		obj.show();
		obj.display();
		//obj.childDisplay(); //C.E.
	}

}
