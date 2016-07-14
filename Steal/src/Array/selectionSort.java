package Array;

public class selectionSort {
public static void main(String[] args) {
	int[] a = {9,3,6,4,8,2};
	selectionSort b = new selectionSort();
	a = b.selectionSort(a);
	for(int i=0;i<a.length;i++){
		System.out.print(a[i] + " ");
	}
}

int[] selectionSort(int[] a){
	for(int i=0;i<a.length;i++){
		int min = a[i];
		int pos = i;
		for(int j=i+1;j<a.length;j++){
			if(a[j]<min){
				min = a[j];
				pos = j;
			}
		}
		int temp = a[i];
		a[i] = a[pos];
		a[pos] = temp;
	}
	return a;
}
}

//this is also having O(n2) time complexity
