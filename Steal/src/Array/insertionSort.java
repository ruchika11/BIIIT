package Array;

public class insertionSort {
public static void main(String[] args) {
	int[] a = {2,9,3,6,1,8,2};
	insertionSort b = new insertionSort();
	a = b.insertionSort(a);
	for(int i=0;i<a.length;i++){
		System.out.print(a[i] + " ");
	}
}

int[] insertionSort(int[] a){
	for(int i=0;i<a.length-1;i++){
		if(a[i+1]<a[i]){
			int temp = a[i+1];
			a[i+1] = a[i];
			a[i] = temp;
		}
		int min = a[i];
		int pos = i;
		for(int j=0;j<=i;j++){
			if(min<a[j]){
				int temp = a[pos];
				a[pos] = a[j];
				a[j] = temp;
			}
			min = a[pos];
		}
	}
	return a;
}

}

//this is also having O(n2) time complexity
