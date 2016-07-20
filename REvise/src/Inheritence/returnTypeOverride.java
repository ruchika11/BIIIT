package Inheritence;

public class returnTypeOverride extends A {
public static void main(String[] args) {
	
}

//returnTypeOverride myName(){
//	return new returnTypeOverride(); //in sub
//}

A myName(){
	return new A();
}

returnTypeOverride yourName(){
	return new returnTypeOverride();
}

}

class A{
	A myName(){
		return new A();
	}
	
	returnTypeOverride yourName(){
		return new returnTypeOverride();
	}
}

/* 
 * parent class A
 * Sub Class returnTypeOverride
 * in super class method return type is of super class so in sub class return type could be of sub class or super class
 * in super class method return type is of sub class so in sub class return type could be of only sub class
 */
