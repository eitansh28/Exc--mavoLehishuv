package matala2k;

import java.util.Arrays;

public class NextGeneration {

	
	public static boolean IsInside(boolean[][] cells, int x, int y) {
		boolean isInside=true;
		if(x<0 || x>=cells.length || y<0 || y>=cells[0].length)
			isInside=false;
		return isInside;
	}
	public static boolean CheckCell(boolean[][] cells, int x, int y) {
		boolean checkCell=false;
			if(cells[x][y])
				checkCell=true;
			return checkCell;
	}

	public static int numberOfNeighbors(boolean[][] cells,int x,int y) {
		int count=0;
		if(IsInside(cells,x-1,y-1) && CheckCell(cells,x-1,y-1) ) {
			count++;}
		if(IsInside(cells,x-1,y) && CheckCell(cells,x-1,y) ) {
			count++;}
		if(IsInside(cells,x-1,y+1) && CheckCell(cells,x-1,y+1) ) {
			count++;}
		if(IsInside(cells,x,y-1) && CheckCell(cells,x,y-1) ) {
			count++;}
		if(IsInside(cells,x,y+1) && CheckCell(cells,x,y+1) ) {
			count++;}
		if(IsInside(cells,x+1,y-1) && CheckCell(cells,x+1,y-1) ) {
			count++;}
		if(IsInside(cells,x+1,y) && CheckCell(cells,x+1,y) ) {
			count++;}
		if(IsInside(cells,x+1,y+1) && CheckCell(cells,x+1,y+1) ) {
			count++;}
		return count;
	}

	public static boolean[][] nextGeneration(boolean[][] cells){
		boolean [][]ans=new boolean[cells.length][cells[0].length];
		for(int i=0;i<cells.length;i++) {
			for(int j=0;j<cells[0].length;j++) {
				if(cells[i][j] && (numberOfNeighbors(cells,i,j)==2 || numberOfNeighbors(cells,i,j)==3)) {
					ans[i][j]=true;
				}else if(!cells[i][j] && numberOfNeighbors(cells,i,j)==3) {
					ans[i][j]=true;
				}
				else {
					ans[i][j]=false;
				}
			}
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][]ans= {{true,true,false,true},{false,true,false,false},{true,false,true,true},{false,false,false,true}};
		boolean[][]ans1= {{true, true, true, false}, {false, false, false, true}, {false, true, true, true}, {false, false, true, true}};
		System.out.println(Arrays.deepToString(nextGeneration(ans1)));
	}

}
