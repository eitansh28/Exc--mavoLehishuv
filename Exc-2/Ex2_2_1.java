package matala2k;

public class Ex2_2_1 {

	
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPerfect (0));
	}

}
