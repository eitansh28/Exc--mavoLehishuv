package Ex1;
//package matala1k;

public class Ex1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=MyConsole.readInt("Enter n");
		double m=MyConsole.readInt("Enter m");
		double Dub;
		//double w=0;
		if(m==1 || m%2==0 && m!=2) {
			Dub=0;
		}else {
			Dub=n;  //If the number is odd then multiplying the second number by '1' will surely be part of the result
		}
		for(int i=0;Math.pow(2, i)<=m;i++) {
			if(Math.pow(2, i)>=(0.5*m) && m-Math.pow(2, i)>=0) { //Run to the highest power of 2 included in the number, multiply the second number by the power and subtract the 'power by 2' from the original number until there is nothing left to subtract.
				Dub+=n*(Math.pow(2, i));
				//w=Dub;
				//System.out.println(Dub);
				m=m-Math.pow(2, i);
				i=0;
			}
		}System.out.println(Dub);
	}

}
