package matala2k;

public class Ex2_4_1 {

	
	public static int hex2Dec(String hex) {
		for(int i=0;i<hex.length();i++) {
			if(hex.charAt(i)<49 || hex.charAt(i)>57 && hex.charAt(i)<65 || hex.charAt(i)>70)
				return -1;
		}
		int sum=0; 
		for(int i=hex.length()-1;i>=0;i--) {
			int k=Math.abs(hex.length()-i-1);
			if(hex.charAt(i)=='A') {
				 sum+=10*(int)Math.pow(16, k);
			 }else if(hex.charAt(i)=='B') {
				 sum+=11*(int)Math.pow(16, k);
			 }else if(hex.charAt(i)=='C') {
				 sum+=12*(int)Math.pow(16, k);
			 }else if(hex.charAt(i)=='D') {
				 sum+=13*(int)Math.pow(16, k); 
			 }else if(hex.charAt(i)=='E') {
				 sum+=14*(int)Math.pow(16, k);
			 }else if(hex.charAt(i)=='F') {
				 sum+=15*(int)Math.pow(16, k);
			 }else {
				 int m=Integer.parseInt(""+hex.charAt(i));
				 sum+=m*(int)Math.pow(16, k);
			 }
		 }return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="2F9";
		System.out.println(hex2Dec(s));
	}

}
