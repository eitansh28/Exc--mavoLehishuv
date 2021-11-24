package matala4k;

public interface Frame {
	
	int size();
	
	 void rotate90();
	
	 void smooth(int n);
	 
	 int[] getPixel(int x, int y);
	 
	 void crop(int x, int y );
	 
	 void addFrom(Frame f);
	 
	 
	 
	 

}
