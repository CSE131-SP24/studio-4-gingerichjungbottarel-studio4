package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.25);
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.filledCircle(0.5, 0.55, 0.15);
		StdDraw.filledRectangle(0.5, 0.4, 0.1, 0.05);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(0.45, 0.55, 0.03);
		StdDraw.filledCircle(0.55, 0.55, 0.03);
		StdDraw.filledRectangle(0.45, 0.4, 0.01, 0.04);
		StdDraw.filledRectangle(0.55, 0.4, 0.01, 0.04);
		StdDraw.filledRectangle(0.485, 0.4, 0.01, 0.04);
		StdDraw.filledRectangle(0.515, 0.4, 0.01, 0.04);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(0.8, 0.5, 0.03);
		StdDraw.filledCircle(0.2, 0.5, 0.03);
		StdDraw.filledRectangle(0.8, 0.5, 0.01, 0.15);
		StdDraw.filledRectangle(0.2, 0.5, 0.01, 0.15);
		StdDraw.filledCircle(0.8, 0.35, 0.03);
		StdDraw.filledCircle(0.8, 0.65, 0.03);
		StdDraw.filledCircle(0.2, 0.35, 0.03);
		StdDraw.filledCircle(0.2, 0.65, 0.03);
	}
}