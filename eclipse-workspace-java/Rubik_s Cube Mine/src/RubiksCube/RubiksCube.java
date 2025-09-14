package RubiksCube;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RubiksCube extends JPanel {
	
	static int xlen = 600, ylen = 600;

	class Refresh extends TimerTask {
	    public void run() {
			game();
			repaint();
	    }
	}

	public RubiksCube() throws IOException {
		setPreferredSize(new Dimension(xlen, ylen));
		setBackground(new Color(200, 200, 200));
		Timer refresh = new Timer();
		refresh.schedule(new Refresh(), 0, 1000/60);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		Mouse mouse = new Mouse();
		f.addMouseListener(mouse);
		f.addMouseMotionListener(mouse);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Rubix Cube");
		f.add(new RubiksCube(), BorderLayout.CENTER);
		f.setResizable(false);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public static void game() {
		
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
//		System.out.println("Painted");
	}
}
