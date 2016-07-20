package Inheritence;

public class privateMethod extends C {

public static void main(String[] args) {
	C a = new C();
	int b = a.m1();
	System.out.println(b);
}	
}

class C {
	private int a =10;
	
	public int m1(){
		return a;
	}
}
