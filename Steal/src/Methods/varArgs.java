package Methods;

public class varArgs {
public static void main(String[] args) {
	varArgs a = new varArgs();
	a.display(1,"ruchika",'a',9.8);
}

void display(Object... values){
	for(Object a:values){
		System.out.println("object is "+a);
	}
}
}
