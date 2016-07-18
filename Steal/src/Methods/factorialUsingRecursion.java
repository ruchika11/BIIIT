package Methods;

public class factorialUsingRecursion {  
public static void main(String[] args) {
  int f = factorial(5);
  System.out.println(f);
}
static int factorial(int a){
	if(a==0){
		return 1;
	}
	else return a*factorial(a-1);
}
}
