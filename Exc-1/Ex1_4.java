package Ex1;
//package matala1k;

public class Ex1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=MyConsole.readInt("enter a number: 0) exit, 1) aX^2+bX+c=0");
			while(num==1) {  //As long as the user selects '1' the software continues to work
			System.out.println("aX^2+bX+c=0: enter a,b,c:");
			double a=MyConsole.readDouble("Enter a");
			double b=MyConsole.readDouble("Enter b");
			double c=MyConsole.readDouble("Enter c");
			if(a==0 && b==0 && c==0) {
				System.out.println("x1 can be any number - trivial!");
			}else if(a==0 && b==0 && c!=0) {
				System.out.println("Error, no answer!");
			}else if(a==0 && b!=0) {
				System.out.println("x1=x2="+-c/b);
			}else {
			double b2=(double)Math.pow(b, 2);
			double sh=b2-(4*a*c);
			double sq=Math.sqrt(sh);
			if(sh<0) {
				System.out.println("the parabola does not intersect the x-axis");
			}else if(sh==0) {
				System.out.println("x1=x2="+(-b/(2*a)));
			}else {
				System.out.println("x1="+((-b+sq)/(2*a))+",x2="+((-b-sq)/(2*a)));
			} 
		}num=MyConsole.readInt("enter a number: 0) exit, 1) aX^2+bX+c=0");}
		
			System.out.println("Ex1 - done!");		//Selecting a number other than '1' will exit the software
		}
	}

