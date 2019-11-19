package com.venkat;


public class Test {
	int id =101;
	String name = "Ted";

	void show() {// non static
		System.out.println("Hello World....");
		
		System.out.println(id);
		System.out.println(name);
		
	}
	public static void main(String[] args) {// static
	  // create obj for Test'
		
		Test t1 = new Test();
		t1.show();
		

	}

}
