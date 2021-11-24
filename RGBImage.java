package matala4k;

public class RGBImage implements Frame, Comparable<Frame>{
	
	
	private int frame[][][];
	private int size;

	public RGBImage(int[][][]frames) {
		this.frame=frames;
		this.size=frames[0][0].length*frames.length;
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<frames.length;j++) {
//				for(int k=0;k<frames[0].length;k++) {
//					this.frame[i][j][k]=frames[i][j][k];
//				}
//			}
//		}
	}
	public RGBImage(RGBImage other) {
		this.frame =other.frame;
		this.size=other.size;
		}
	
	public int[][][] getFrame(){
		return frame;
	}
	
	public int size(){
		return frame.length*frame[0].length;
	}
	@Override
	public int compareTo(Frame f) {
		// TODO Auto-generated method stub
		int dub=frame.length*frame[0].length;
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
		int[][][]ninety=new int[3][frame[0].length][frame.length];
		for(int k=0;k<3;k++) {
			for(int i=0;i<frame.length;i++) {
				for(int j=0;j<frame[0].length;j++) {
					ninety[k][j][frame.length-1-i]=frame[k][i][j];
				}
			}
		}frame=ninety;
	}
	public static int ezer(int[][][] t,int k,int x,int y,int n) {
		int sum=0;
		int count=0;
		if(n%2==0)
			n=n-1;
		for(int i=x-((n-1)/2);i<=x+((n-1)/2);i++) {
			for(int j=y-((n-1)/2);j<=y+((n-1)/2);j++) {
				if(j>=0 && j<t[0].length && i>=0 && i<t.length) {
					sum+=t[k][i][j];
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
		int[][][]smooth=new int[3][frame.length][frame[0].length];
		for(int k=0;k<3;k++) {
			for(int i=0;i<frame.length;i++) {
				for(int j=0;j<frame[0].length;j++) {
					smooth[k][i][j]=ezer(frame,k,i,j,n);
				}
			}
		}frame=smooth;
	}
	@Override
	public int[] getPixel(int x, int y) {
		// TODO Auto-generated method stub
		int[]arr=new int[3];
		arr[0]=frame[0][x][y];
		arr[1]=frame[1][x][y];
		arr[2]=frame[2][x][y];
		return arr;
	}
	@Override
	public void crop(int x, int y) {
		// TODO Auto-generated method stub
		int[][][]arr=new int[3][x+1][y+1];
		for(int k=0;k<3;k++) {
			for(int i=0;i<=x;i++) {
				for(int j=0;j<=y;j++) {
					arr[k][i][j]=frame[k][i][j];
				}
		     }
		}frame=arr;
	}
	@Override
	public void addFrom(Frame f) {
		// TODO Auto-generated method stub
		if(f instanceof RGBImage && f.size()==frame.length*frame[0].length) {
		for(int k=0;k<3;k++) {
			for(int i=0;i<frame.length;i++) {
				for(int j=0;j<frame[0].length;j++) {
					frame[k][i][j]=frame[k][i][j]+f.getPixel(i, j)[k];
					if(frame[k][i][j]+f.getPixel(i, j)[k]>255)
						frame[k][i][j]=255;
				}
			}
		 }
		}
	}


	
	
	

}
