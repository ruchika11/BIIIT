package classes;

public class constructor {
	private int c ;
public static void main(String[] args) {
	constructor a = new constructor();
}
constructor() {
	this(10);
	System.out.println("hi");
}
constructor(int a){
	this(1,2);
	System.out.println("a is "+a);
	
}
constructor(int a,int b){
	System.out.println(" a and b is "+a+" and " + b);
}
}
