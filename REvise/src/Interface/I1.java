package Interface;

public interface I1{
	int a = 0; // each field should be initialed
	final int b =0; 
	final static int c = 0; 
	void run(int a);
	void run1(int b);
}

interface I2{
	int a=1;
	int b= 2;
	int c = 3;
}
 class E implements I1,I2{
	 
	public void run(int a){
		
	}
	public void run1(int b){
		
	}
	public static void main(String[] args) {
		System.out.println(I1.a);
		System.out.println(I2.c);
		System.out.println(I1.b);
	}
 }
 
 interface I3 extends I1,I2{
	 
 }












//An interface is a reference type,similar to a class that can only contain constants,method signatures,default methods,static methods,
// and nested types
//method bodies only exist for default and static methods
//Interface can not be instantiated ,they can only be implemented and extend by other class.
//interface only contain abstract method no concrete method
//It can not contain constructor
//it can have only public ,static and final variable
 //an interface can only be public or default ,it could not be protected
 //in an interface all methods my default are public so you have to override in class as public modifier other wise it will give error
 //if you have same fields in both interface then you have to give reference of interface other wise it will give ambiguous error
 //if you don't want to override abstract method in sub class you can again declare it as abstract
 //interface extends only interface not classes
 //concrete and abstract both classes can implement interface
 // interface actually is the contract between modules in java project
 //Marker interface in Java is interfaces with no field or methods or in simple word empty interface in java is called marker interface.
//Serializable, Clonnable and remote interface is the example of marker interface(tag interface) and it is used to give some signal or command to compiler
 //annotation is better option then marker interface
