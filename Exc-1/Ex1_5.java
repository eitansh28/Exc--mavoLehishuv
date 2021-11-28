package Ex1;
//package matala1k;

import java.awt.Color;
import java.awt.Font;

public class Ex1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=MyConsole.readDouble("Enter a");
	    double b=MyConsole.readDouble("Enter b");
		double c=MyConsole.readDouble("Enter c");
		//We will first draw the axes themselves (screen size is 1 on 1)
		StdDraw.line(0, 0.5, 1, 0.5);	//Drawing the X-axis
		StdDraw.line(0.5, 1, 0.5, 0);	//Drawing the y-axis
		double min=-11,max=11;
		for(double x1=-11;x1<=11;x1++) {
			double y1=a*Math.pow(x1, 2)+(b*x1)+c;
			if(y1>max)
				max=y1;
			if(y1<min)
				min=y1;
		}
		StdDraw.setScale(min, max);
		//StdDraw.setScale(-11, 11);		//Set the painting range
		StdDraw.setPenColor(Color.LIGHT_GRAY);
		for (int i = -11; i <= 11; i++) {  //vertical lines and horizontal lines
			StdDraw.line(i,-11,i,11);
			StdDraw.line(-11,i,11,i);
		}
		StdDraw.setPenRadius(0.002);
		for( double k=-10;k<=10;k=k+2) {     //Writing numbers on the axes
			StdDraw.setPenColor(Color.RED);
			StdDraw.text(k, 0, Double.toString(k));
			StdDraw.text(0, k, Double.toString(k));
		}
		for (double x = -10; x <= 10; x=x+0.002) {   //Drawing the parabola by drawing all the points
			double y=a*Math.pow(x, 2)+(b*x)+c;
			StdDraw.setPenColor(Color.BLUE);
			StdDraw.point(x, y);
		}
	}
}
