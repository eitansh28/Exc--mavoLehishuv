package matala4k;

public class GrayImage implements Frame, Comparable<Frame> {
	
	private int[][] frame;
	private int size;
	

	public GrayImage(int[][]frames) {
		this.frame=frames;
		this.size=frame.length*frame[0].length;
//		for(int i=0;i<frames.length;i++) {
//			for(int j=0;j<frames[0].length;j++) {
//				this.frame[i][j]=frames[i][j];
//			}
//		}
	}
	public GrayImage(GrayImage other) {
		this.frame = other.frame;
		this.size=other.size;
		}
	
	public int[][] getFrame(){
		return this.frame;
	}
	
	public int size(){
		return frame.length*frame[0].length;
	}
	@Override
	public int compareTo(Frame f) {
		// TODO Auto-generated method stub
		int dub=this.size;
		if(f.size()==dub) {
			return 0;
		}else if(f.size()>dub){
			return -1;
		}else {
			return 1;
		}	
	}
	@Override
	public void rotate90() {
		// TODO Auto-generated method stub
		int[][]ninety=new int[frame[0].length][frame.length];
		for(int i=0;i<frame.length;i++) {
			for(int j=0;j<frame[0].length;j++) {
				ninety[j][frame.length-1-i]=frame[i][j];
			}
		}frame=ninety;
	}
	public static int ezer(int[][] t,int x,int y,int n) {
		int sum=0;
		int count=0;
		if(n%2==0)
			n=n-1;
		for(int i=x-((n-1)/2);i<=x+((n-1)/2);i++) {
			for(int j=y-((n-1)/2);j<=y+((n-1)/2);j++) {
				if(j>=0 && j<t[0].length && i>=0 && i<t.length) {
					sum+=t[i][j];
					count++;
					}
			}
		}
		sum/=(count);
		return sum;
	}
	@Override
	public void smooth(int n) {
		// TODO Auto-generated method stub
		if(n<3)
			return;
		int[][]smooth=new int[frame.length][frame[0].length];
		for(int i=0;i<frame.length;i++) {
			for(int j=0;j<frame[0].length;j++) {
				smooth[i][j]=ezer(frame,i,j,n);
			}
		}frame=smooth;
	}
	@Override
	public int[] getPixel(int x, int y) {
		// TODO Auto-generated method stub
		int pixel=frame[x][y];
		int[]arr= {pixel};
		return arr;
	}
	@Override
	public void crop(int x, int y) {
		// TODO Auto-generated method stub
	int[][]arr=new int[x+1][y+1];
	for(int i=0;i<=x;i++) {
		for(int j=0;j<=y;j++) {
			arr[i][j]=frame[i][j];
		}
	}frame=arr;
	}
	@Override
	public void addFrom(Frame f) {
		// TODO Auto-generated method stub
		if(f instanceof GrayImage && f.size()==frame.length*frame[0].length) {
		for(int i=0;i<frame.length;i++) {
			for(int j=0;j<frame[0].length;j++) {
				frame[i][j]=frame[i][j]+f.getPixel(i, j)[0];
				if(frame[i][j]+f.getPixel(i, j)[0]>255)
					frame[i][j]=255;
			}
		 }
		}
	}
	

	
	
	
}
