package Array;



public class bubbleSort {

public static void main(String[] args) {

bubbleSort bs = new bubbleSort();

int[] a =  {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

bs.bubbleSort(a);

for(int i=0;i<a.length;i++){

System.out.print(a[i] + " ");


}

}

 

 int[] bubbleSort(int[] a){

for(int i=0;i<a.length-1;i++){

for(int j=0;j<a.length-1;j++){

if(a[j]>a[j+1]){

int temp = a[j+1];

a[j+1] = a[j];

a[j] = temp;

}

}

}

return a;

 }

}



//complexity of bubble sort is:
//worst case and average case complexity is O(n2)
//this is not better sorting method in case of performance

