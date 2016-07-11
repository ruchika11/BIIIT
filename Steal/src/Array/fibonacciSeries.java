package Array;



import java.lang.reflect.Array;



public class fibonacciSeries {

public static void main(String[] args) {

int[] fs = fibonacciSeries();

for(int j=0;j<fs.length;j++){

System.out.print(fs[j] + " ");

}

}



public static int[] fibonacciSeries(){

int[] fs = new int[10];

fs[0] =0;

fs[1] =1;

for(int i=2;i<fs.length;i++){

fs[i] = fs[i-1]+fs[i-2];

}

return fs;

}

}

