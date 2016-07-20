package Inheritence;

public class modifierOverride extends B {
public static void main(String[] args) {
	
}
public void myName(){
	
}
}


class B{
	public void myName(){
		System.out.println("ruchika");
	}
}


/* 
 * parent class A
 * Sub Class modifierOverride
 * you can increase visibility of access modifiers like 
 * Super class: Private---->you can not access it and if you have declare same name method of private modifier the you created that subclass method itself, you are not over riding it.
 * super class: protected then sub class overridden method can be protected/public
 * super class: public then sub class overridden method can only be public
 * you can not decrease visibility of method in sub class
 */