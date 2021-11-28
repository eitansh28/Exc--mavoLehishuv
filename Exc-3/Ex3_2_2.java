package matala3k;

public class Ex3_2_2 {

	public static boolean checkPowerThree(int x) {
		boolean ans=true;
		String s="";
		int i=0;
		if(x%3!=0 && (x-1)%3!=0 || x==0) {
			ans=false;
		}else {
			while(x>0) {
				for(int k=0;Math.pow(3, k)<=x;k++) {
					i=k;
				}s+="3^"+i+'+';
				x-=Math.pow(3, i);	
			}
				for(int l=2;l<s.length()-4;l=l+4) {
					if(s.charAt(l)==s.charAt(l+4)) {
						ans=false;
						break;
					}
			}if(ans)
				System.out.println(s.substring(0, s.length()-1));
		}return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
