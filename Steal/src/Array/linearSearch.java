package Array;

public class linearSearch {
public static void main(String[] args) {
	int[] a = {2,8,9,10,77};
	linearSearch b = new linearSearch();
    b.linearSearch(a,77);
}
void linearSearch(int[] a,int n){
	int pos = 0;
	boolean found = false;
	for(int i=0;i<a.length;i++){
		if(a[i] == n){
			pos = i;
			found= true;
			break;
		}
		
	}
	if(found){
		System.out.println("position is "+ pos);
	}
	else{
		System.out.println("not found");
	}
	
}
}

//complexity of linear search is O(n)	
