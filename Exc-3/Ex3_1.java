package matala3k;
import java.util.Scanner;
public class Ex3_1 {

	public static void geussNumber(int N) {
		System.out.println("hellow! Please think of a number between 0 and N");
		int steps=0;
		int ans=0;
		int left=0,right=N,middle=(left+right)/2;
		Scanner sc =new Scanner(System.in);
		while(ans!=1) {
		System.out.println(middle);
		System.out.println("choose the right answer");
		System.out.println("1) This is the number you thought of");
		System.out.println("2) Is the number you thought of smaller than the number I printed?");
		System.out.println("3) Is the number you thought of greater than the number I printed?");
		ans=sc.nextInt();
		if(ans!=1 && ans!=2 && ans!=3) {
			System.out.println("please choose 1/2/3");
		}
		if(ans==2) {
			right=middle-1;
		}
		if(ans==3) {
			left=middle+1;
		}middle=(left+right)/2;
		steps++;
		}System.out.println(steps);
		System.out.println("WIN!");	
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//geussNumber(85);
	}

}
