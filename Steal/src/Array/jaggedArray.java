package Array;

public class jaggedArray {
public static void main(String[] args) {
	int[][] a = new int[4][];
	a[0] = new int[1]; 
	a[1] = new int[2];
	a[2] = new int[3];
	a[3] = new int[4];
	jaggedArray(a);
}
static void jaggedArray(int a[][]){
	int k=0;
	for(int i=0;i<a.length;i++){
		for(int j=0;j<i+1;j++){
			a[i][j] = k;
			k++;
		}
	}
	for(int i=0;i<a.length;i++){
		for(int j=0;j<i+1;j++){
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
}
}