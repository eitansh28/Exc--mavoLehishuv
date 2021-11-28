package matala2k;

import java.util.Arrays;

public class Ex2_2_2 {

	public static boolean isPerfect (int n) {
		boolean isperf=false;
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum+=i;
		}if(sum==n && sum!=0) {
			isperf=true;
		}return isperf;
	}
	
	public static int[] PerfectNumbers(int n) {
		int size=0;
		int k=0;
		for(int i=1;i<=n;i++) {
			if(isPerfect(i))
				size++;
		}int[]perfarr=new int[size];
		for(int i=1;i<=n;i++) {
			if(isPerfect(i)) {
				perfarr[k]=i;
				k++;
			}
		}return perfarr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(PerfectNumbers(9087)));
	}

}
