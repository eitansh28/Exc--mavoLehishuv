package matala2k;
import java.awt.Color;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

import Ex1.StdDraw;
public class GameOfLife {

	public static void gameOfLife (int n, int cellSize) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setScale(0, cellSize*n);
		for(int x=0;x<=cellSize*n;x+=cellSize) {
			StdDraw.line(x, 0, x,cellSize*n);
		}for(int y=0;y<=cellSize*n;y+=cellSize) {
			StdDraw.line(0, y,cellSize*n, y);
		}
	}
	public static boolean[][] randMat(int n){
		boolean[][]mat=new boolean[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				mat[i][j]=Math.random()>0.5;
			}
		}return mat;
	}
	
	public static void drawCells(boolean[][]cells, int cellSize, Color color) {
		gameOfLife(cells.length,cellSize);
		cells=randMat(cells.length);
		System.out.println(Arrays.deepToString(cells));
		StdDraw.setPenColor(color);
		StdDraw.clear();
		cells=NextGeneration.nextGeneration(cells);
		for(int i=0;i<cells.length;i++) {
				for(int j=0;j<cells[0].length;j++) {
				if (cells[i][j]) {
					double p = (j*cellSize + (double)cellSize/2);
					double q = cellSize*cells.length-(i*cellSize + (double)cellSize/2);
					StdDraw.filledSquare(p,q, (double)cellSize/2);
					}
				}
			}
		StdDraw.setPenColor(StdDraw.BLACK);
		for(int x=0;x<=cellSize*cells.length;x+=cellSize) {
			StdDraw.line(x, 0, x,cellSize*cells.length);
		}for(int y=0;y<=cellSize*cells.length;y+=cellSize) {
			StdDraw.line(0, y,cellSize*cells.length, y);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][]ans= {{false,true,false},{false,true,false},{true,false,true}};//,{false,false,false,true}};
		//drawCells(ans,54,StdDraw.GREEN);
	    boolean[][] v=randMat(5);
	    drawCells(v,15,StdDraw.GREEN);
		//System.out.println(Arrays.deepToString(v));
		//System.out.println(Arrays.deepToString(NextGeneration.nextGeneration(v)));
	}

}
