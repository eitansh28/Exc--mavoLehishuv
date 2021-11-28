package matala3k;

import java.util.Arrays;

public class Ex3_3_1 {

	public static int mod(int m,int n) {
		if(n==0)
			return -1;
		int k=1;
		int dub=0;
		while((k*n)<=m) {
			dub=k*n;
			k++;
		}int mod=m-dub;
		return mod;
	}
	
	public static int[] sortModArray(int[] a,int n) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
			if(mod(a[j],n)>mod(a[j+1],n)) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		}return a;
	}
	
	public static  boolean isIn(int[]a,int num) {
		boolean isIn=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num)
				isIn=true;
		}return isIn;
	}
	
	public static int searchModArray(int[] a,int n, int num) {
		if(isIn(a,num)==false)
			return -1;
		a=sortModArray(a,n);
		int left=0,right=a.length-1,middle=(left+right)/2;
		while(num!=a[middle]) {
		if(mod(num,n)>=mod(a[middle],n)) {
			left=middle+1;
		}else{
			right=middle-1;
		}middle=(left+right)/2;
		}return middle;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []a= {13,8,107,12,51,233,25};
//		System.out.println(mod(7,4));
		//System.out.println(Arrays.toString(sortModArray(a,6)));
		//System.out.println((searchModArray(a,6,25)));
	}

}
