package Ex1;
//package matala1k;

public class Ex1_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= MyConsole.readInt("enter max number: ");
		if(n<5)
			System.out.println("No twin prime were found");
		boolean twprime=true;
		for(int i=3;i+2<=n;i++) {
			for(int j=2;j<=Math.sqrt(i+2);j++) {
				if(i%j==0 || (i+2)%j==0)  	//Check that both numbers are prime 
					twprime=false;}
				if(twprime) 
						System.out.print("("+i+","+(i+2)+")");
				twprime=true;     			//Return the 'true' value for checking the following numbers
				}			
	}
	}
