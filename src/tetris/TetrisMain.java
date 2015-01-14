package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TetrisMain extends JPanel {
	
	private ArrayList<Tetromino> tetromino;
	
	public static void main(String[] args) {
		TetrisMain tetris = new TetrisMain();
		JFrame frame = new JFrame();
		//frame.setLocationRelativeTo(null);
		frame.add(tetris);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Tetris");
		frame.setResizable(false);
		tetris.init();
		frame.pack();
		frame.setVisible(true);

	}
	
	public void init()
	  {
	    this.setPreferredSize(new Dimension(600, 840));
	    this.setBackground(Color.WHITE);
	  }
	
	public void paint(Graphics g) {
		super.paint(g);
		
	}
	
//	public void drawTetroBlock(Graphics g, int x, int y, Color color) {
//		g.setColor(Color.BLACK);
//		g.fillRect(x*24, y*24, 24, 24);
//		g.setColor(color);
//		g.fillRect(x*24+1, y*24+1, 22, 22);
//	}
//	
//	public void drawTetro(Graphics g, int x, int y) {
//		drawTetroBlock(g, x, y, Color.BLUE);
//		drawTetroBlock(g, x, y+1, Color.BLUE);
//		drawTetroBlock(g, x+1, y, Color.BLUE);
//		drawTetroBlock(g, x+2, y, Color.BLUE);
//	}

}
