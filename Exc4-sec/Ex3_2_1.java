package matala3k;

public class Ex3_2_1 {

	
	public static boolean isFormula(String s) {
		if (s.length()==1) {
			if ((s.charAt(0)>='0' && s.charAt(0)<='9')  || s.charAt(0) == 'x')
				return true;
		}
		if(s.length()>1 && (s.charAt(0)!='(' || s.charAt(s.length()-1)!=')'))
				return false;
		int right = 0;
		int left= 0;
		for (int i=1; i<s.length()-1; i++) {
			if (s.charAt(i) == '(')
				left++;
			if (s.charAt(i) == ')')
				right++;
			if (right>left)
				return false;
			if(right==left) {
				if(s.charAt(i+1) != '+' && s.charAt(i+1) != '-' && s.charAt(i+1) != '*') 
					return false;
				String s1 = s.substring(1,i+1);
				String s2 = s.substring(i+2,s.length()-1);
				return isFormula(s1) && isFormula(s2);
			}
	}
		return false;
	}
	

	public static double assign(String s, int x) {
		if(!isFormula(s)) {
			 return Double.NaN;}
			double sum=0;
			if (s.length() == 1) {
			if (s.charAt(0)>='0' && s.charAt(0)<='9')
				return Double.valueOf(s);
			else 
				return x;
			}else{
				for(int i=0;i<s.length()-1;i++) {
					if(s.charAt(i)=='*')
						sum+=(Double.valueOf(s.charAt(i-1))*Double.valueOf(s.charAt(i+1)));
					if(s.charAt(i)=='+')
						sum+=(Double.valueOf(s.charAt(i-1))+Double.valueOf(s.charAt(i+1)));
					if(s.charAt(i)=='-')
						sum+=(Double.valueOf(s.charAt(i-1))-Double.valueOf(s.charAt(i+1)));
				}
			}return sum;
	}	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
