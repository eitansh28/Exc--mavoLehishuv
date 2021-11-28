package matala2k;

import java.util.Arrays;

public class Ex2_1 {

	public static boolean isprime(int n) { 
		boolean isprime=true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) 
				isprime=false;
			}return isprime;
	}
	public static int[] arrprime(int n){
		int count=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0 && isprime(i))
				count++;
		}int[]arr=new int[count];
		int k=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0 && isprime(i)) {
				arr[k]=i;
				k++;
			}
		}return arr;
	}
	public static int[] bubblesort(int []n) {
		for(int i=0;i<n.length-1;i++) {
			for(int j=i+1;j<n.length;j++) {
			if(n[i]>n[j]) {
				int temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}
			}
		}return n;
	}
	
	public static int[] WithoutZero(int []n) {
		int size=n.length;
		for(int i=0;i<n.length;i++) {
			if(n[i]==0) {
				size--;
			}
		}
		int[]arr=new int[size];
			for(int j=0;j<arr.length;j++) {
				arr[j]=n[j];
		}return arr;
	}
	
	public static int[] primeDividers(int n) {
		int sum=1;
		int k=0;
		int[] arr=arrprime(n);
		int[] arr2=new int[(int)(0.5*n)];
		while(n>1) {
			sum=1;
			arr=arrprime(n);
			for(int i=0;i<arr.length;i++) {
				sum*=arr[i];
				arr2[k]=arr[i];
				k++;
		}n=n/sum;
		}int[]arr3=WithoutZero(arr2);
		int[]arr4=bubblesort(arr3);
		return arr4;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[]arr={
		System.out.println(Arrays.toString(primeDividers(1)));
		//System.out.println(isprime(2113));
	}

}
