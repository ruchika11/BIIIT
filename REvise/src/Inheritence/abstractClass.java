package Inheritence;

abstract public class abstractClass {
 abstract public int myName(int a);
 abstract protected int yourName(boolean b);
// abstract private int hisName();
 abstract int herName(abstractClass c);
 abstract int thierName(int c, String d);
 
 int a1 ;
 static int b1;
 
 public static void thoseName(){
	 System.out.println("concrete methods in abstract class");
 }
 
 private void allName(){
	 System.out.println("private methods but this is concrete method");
 }
 
 public final void m1(){
	 
 }
 
 int a = 0;
 final static int b = 2;
}

//class D extends abstractClass{
//	void m1(){
//		System.out.println(a);
//		System.out.println(abstractClass.b);
//	}
//}
















//abstract class may have constructor but it will not use for create object but for obtaining constructor chaining
// abstract only defined in abstract class
//there is no any kind of abstract field it will always be abstract method
// abstract method can not be static
// abstract method is always be public or protected or default but it will never be private.
//abstract class can not be instantiated but it could be subclasses
//abstract method can not have method body but it can have return type and passing argument
//you can declare fields that are not static and final, and define public, protected, and private concrete methods
//you can not use abstract and final both together
//With interfaces, all fields are automatically public, static, and final, and all methods that you declare or define (as default methods) are public
//if you have extends abstract class you have to override all the methods of abstract class
//abstract class can not be private and protected
//abstract method can not be final but abstract class can have concrete final method method 
//any class can be either final or abstract
