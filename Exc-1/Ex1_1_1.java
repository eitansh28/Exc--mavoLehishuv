package Ex1;
//package matala1k;

//import Ex1.MyConsole;

public class Ex1_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isprime=true;
		int checkprime = MyConsole.readInt("enter int: ");
		for(int i=2;i<=Math.sqrt(checkprime);i++) {   //Running to the root is enough to check primacy
			if(checkprime%i==0) 
				isprime=false;			
			}System.out.println(isprime);
	}
}
