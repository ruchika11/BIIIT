package Inheritence;

import java.io.IOException;

class simple{
	public static void main(String[] args) {
	
		
	A a =	new B();
	//a.m1();
	}
}






class A {
	A(){System.out.println("from A costrctor");}
	static{System.out.println("static A");}
	
	{System.out.println("instance from A ");}
public void m1(){
	 System.out.println("from A ");
 }
	
}
class B  extends A {
	B(){
		System.out.println("B costrctor ");
	}
	{System.out.println("from B instance");}
	static {System.out.println(" static from B ");}
  public void m1(){
	System.out.println("From B ");
}
}

