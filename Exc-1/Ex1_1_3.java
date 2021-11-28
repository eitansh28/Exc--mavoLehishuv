package Ex1;
//package matala1k;

public class Ex1_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= MyConsole.readInt("enter max number: ");
		int m= MyConsole.readInt("enter Prime gap number: ");
		if(n<5)
			System.out.println("No twin prime were found");
		boolean twprime=true;
		for(int i=2;i+m<=n;i++) {
			for(int j=2;j<=Math.sqrt(i+m);j++) {
				if(i%j==0 && i!=2 || (i+m)%j==0)   //2 is divisible by 2 but is indeed prime so one of the conditions for getting a 'false' should be that the number is not 2
					twprime=false;}
				if(twprime) 
						System.out.print("("+i+","+(i+m)+")");
				twprime=true;
				}			
	}
	}
