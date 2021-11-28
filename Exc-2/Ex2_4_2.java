package matala2k;

public class Ex2_4_2 {

	public static String opposite(String s) {
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t+=s.charAt(i);
		}return t;
	}
	public static String dec2Hex(int num) {
		String ans="";
		while(num>0) {
		int k=num%16;
		num=(num-k)/16;
		if(k==10) {
			ans+='A';
		}else if(k==11){
			ans+='B';
		}else if(k==12) {
			ans+='C';
		}else if(k==13) {
			ans+='D';
		}else if(k==14) {
			ans+='E';
		}else if(k==15) {
			ans+='F';
		}else {
		String s=String.valueOf(k);
		ans+=s;
		}
		}String finalAns=opposite(ans);
		return finalAns;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r="eitans";
		System.out.println(opposite(r));
		System.out.println(dec2Hex(6988812));
		
	}

}
