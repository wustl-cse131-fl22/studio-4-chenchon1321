package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) 
	{
		StdDraw.setXscale(0,10);
		StdDraw.setYscale(0,10);
		StdDraw.setPenColor(255, 0, 0);
		
		StdDraw.filledRectangle(1,1,1,3);
		StdDraw.setPenColor(0,0,255);
		StdDraw.filledRectangle(3, 1,1 ,3);
		StdDraw.setPenColor(0,0,0);
		
		StdDraw.filledRectangle(5, 1, 1, 3);
	
	}
}