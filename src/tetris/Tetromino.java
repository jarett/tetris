package tetris;

import java.awt.Color;
import java.awt.Graphics;

public class Tetromino {

	final private int BORDER = 24;
	final private int INSIDE = 22;
	private int x;
	private int y;
	private Color color;
	boolean[][] occupied = new boolean[600/BORDER][840/BORDER];
	
	public Tetromino(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void drawTetroBlock(Graphics g, int x, int y, Color color) {
		g.setColor(Color.BLACK);
		g.fillRect(x*BORDER, y*BORDER, BORDER, BORDER);
		g.setColor(color);
		g.fillRect(x*BORDER+1, y*BORDER+1, INSIDE, INSIDE);
	}
	
	public void drawTetro(Graphics g, int x, int y, Color color, String shape) {
		drawTetroBlock(g, x, y, color);
		drawTetroBlock(g, x, y+1, color);
		drawTetroBlock(g, x+1, y, color);
		drawTetroBlock(g, x+2, y, color);
	}
	
	public void removeTetro(Graphics g, int x, int y) {
		for (int i = 0; i < occupied.length; i++) {
			for (int j = 0; j < occupied[0].length; j++) {
				if (this.x == i*24 && this.y == j*24) {
					occupied[i][j] = true;
				} else {
					occupied[i][j] = false;
				}
			}
		}
		boolean rowCheck = false;
		int rowCheckNum = 0;
		for (int i = 0; i < occupied.length; i++) {
			for (int j = 0; j < occupied[0].length; j++) {
				if (occupied[i][j] == true) {
					rowCheck = true;
					rowCheckNum = j;
				} else {
					rowCheck = false;
					continue;
				}
			}
		}
		if (rowCheck) {
			for (int i = 0; i < occupied.length; i++) {
				drawTetro(g, i, rowCheckNum, Color.WHITE);
			}
		}
	}
}
