package com.demo;

public abstract  class Test {
	int i;
	private int j=10;
	public static char c;
	public final int k = 10;
	
	Test(){
		System.out.println("Constructor");
	}

	//concrete method
	 void show() {
		System.out.println("show"); 
	 }
	 

	 abstract void display() ;
}
