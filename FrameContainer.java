package matala4k;

import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.image.BufferedImage;

//import ex4.GUIShape;
//import ex4.Shape_Collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FrameContainer implements ContainerFunctions , Comparable<Frame> {

	private Frame[]collection;
	private int size;
	final int factor=5;
	
	public FrameContainer() {
		collection=new Frame[5];
		size=0;
	}

	public FrameContainer(File f,boolean gray){
		try {
			Scanner myReader = new Scanner(f);
			FrameContainer col=new FrameContainer();
			while (myReader.hasNextLine()){
				Frame temp=MyImageIO.readImageFromFile(myReader.nextLine(),gray);
				col.add(temp);
			}
			myReader.close();
			this.collection=col.collection;
			this.size=col.size;
		}
		catch(IOException e) {
			System.err.println("Err: IOException, not possible to load this file");
		}
	}
	

	@Override
	public int compareTo(Frame f) {
		// TODO Auto-generated method stub
	
		int dub=collection[0].size();
		if(f.size()==dub) {
			return 0;
		}else if(f.size()>dub){
			return -1;
		}else {
			return 1;
		}	
	}

	public Frame[] get() {
		return this.collection;
	}
	@Override
	public Frame get(int i) {
		// TODO Auto-generated method stub
		return collection[i];
	}


	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void add(Frame f) {
		// TODO Auto-generated method stub
		if(size>=collection.length) {
		Frame[]arr=new Frame[collection.length+factor];
		for (int i=0;i<collection.length;i++)
			arr[i]=collection[i];
		collection=arr;
		}collection[size++]=f;
	}

	@Override
	public void remove(Frame f) {
		// TODO Auto-generated method stub
		ArrayList<Frame> arr = new ArrayList<Frame>();
		for(int i=0;i<collection.length;i++) {
			if(collection[i]!=f)
			arr.add(collection[i]);
		}Frame[]arr2=new Frame[collection.length-1];
		for(int j=0;j<arr.size();j++) {
			arr2[j]=arr.get(j);
		}collection=arr2;
		size--;
	}

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		for(int i=0;i<collection.length;i++) {
			for(int j=0;j<size-1;j++) {
					if(collection[j].size()>collection[j+1].size()) {
						Frame temp=collection[j+1];
						collection[j+1]=collection[j];
						collection[j]=temp;	
					}		
				}
		}
	}

	@Override
	public void rotateAll() {
		// TODO Auto-generated method stub
		for(int i=0;i<collection.length;i++) {
			collection[i].rotate90();
		}
	}

	@Override
	public void smoothAll(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<collection.length;i++) {
			collection[i].smooth(n);
		}
	}
}
