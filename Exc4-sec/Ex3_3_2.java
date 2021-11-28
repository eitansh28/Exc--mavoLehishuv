package matala3k;

public class Ex3_3_2 {

	public static boolean Strangers(int n, int m) {
		boolean Strange=true;
		int min=Math.min(n, m);
		int max=Math.max(n, m);
		for(int i=2;i<=min;i++) {
			if(min%i==0 && max%i==0)
				Strange=false;
		}return Strange;
	}
	
	public static int phi(int n) {
		int count =1;
		for(int i=2;i<n;i++) {
			if(Strangers(n, i))
				count++;
		}return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Strangers(667,7));
		System.out.println(667%4);
			
		
	}

}
