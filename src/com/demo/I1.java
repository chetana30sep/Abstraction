package com.demo;

public  interface I1 {
	
	 int a=10; //public static final int a=10;
	
	void m1(); //public abstract void m1();
	 void m6();
	
	//1.8 version
	static void m2() {
		System.out.println("I1-static method");
		//1000 lines of code 
		//m3();
	}
	
	//1.8 version
	default void m4() {
		System.out.println("I1-default method");
	}
	
	/*//after 1.9 v 
	private void m3() {
		
	}*/

}
