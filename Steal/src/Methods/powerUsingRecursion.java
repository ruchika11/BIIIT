package Methods;

public class powerUsingRecursion {
public static void main(String[] args) {
	int p = power(2,3);
	System.out.println(p);
}
static int power(int a,int n){
	if(n==0){
		return 1;
	}
	else{
		return a*power(a,n-1);
	}
}
}
