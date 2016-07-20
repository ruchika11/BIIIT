package polymorphism;

public class superConcept extends Superclass{
	// overrides printMethod in Superclass
    public void printMethod() {
        super.printMethod();
        System.out.println("Printed in Subclass");
        System.out.println(super.a);
    }
    public static void main(String[] args) {
    	superConcept s = new superConcept();
        s.printMethod();    
    }
}

class Superclass {
	
	int a = 2;

    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }
}

//super keyword use to invoke super class members.
//super() calling statement use to call super class constructor
//if you wont specify super() then it will call by default from default constructor
//for parameterized constructor in super class you have to use super() statement to maintain construtor chaining
//and super() statement should always be the first statement
