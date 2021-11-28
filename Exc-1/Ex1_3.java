package Ex1;
//package matala1k;

public class Ex1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=MyConsole.readDouble("Enter a");
		double b=MyConsole.readDouble("Enter b");
		double c=MyConsole.readDouble("Enter c");
		if(a==0 && b==0 && c==0) {
			System.out.println("x1 can be any number - trivial!");
		}else if(a==0 && b==0 && c!=0) {
			System.out.println("Error, no answer!");	//It cannot be that a number different from zero equals zero
		}else if(a==0 && b!=0) {
			System.out.println("x1=x2="+-c/b);    //Becomes an ordinary linear equation
		}else {
		double b2=(double)Math.pow(b, 2);     //Construction of the roots formula
		double sh=b2-(4*a*c);
		double sq=Math.sqrt(sh);
		if(sh<0) {
			System.out.println("the parabola does not intersect the x-axis"); //No square root for negative numbers (in real numbers)
		}else if(sh==0) {
			System.out.println("x1=x2="+(-b/(2*a)));
		}else {
			System.out.println("x1="+((-b+sq)/(2*a))+",x2="+((-b-sq)/(2*a)));
		} 
	}
	}
}

