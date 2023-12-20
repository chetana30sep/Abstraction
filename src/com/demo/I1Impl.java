package com.demo;

//I to C - interface to class 
public class I1Impl implements I1 {

	@Override
	public void m1() {
		System.out.println("I1Impl-m1()");
		
	}
	
	
	void m2() {
		System.out.println("Child m1");
	}
	
	void show() {
		System.out.println("show");
	}
	
	
	public static void main(String[] args) {
		//I1 i = new I1(); //C.E.
		
		I1Impl obj = new I1Impl();
		//obj.m1();
		//obj.a = 100; //C.E.
		//System.out.println(obj.a);
		//System.out.println(I1.a);
		obj.m4();
		I1.m2();
		
		I1 i = new I1Impl();

		
	}

}
