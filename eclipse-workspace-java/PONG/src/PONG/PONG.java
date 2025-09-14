package PONG;

import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.io.*;

import javax.swing.*;
import javax.swing.Timer;

public class PONG extends JPanel{
		
	static File file;
	static BufferedReader reader;
	static int xlen = 1200, ylen = 600, xv = 0, yv = 0, tc1 = 60, tc2 = 30, gs = 20, px = (int) (Math.random() * tc1),
			py = (int) (Math.random() * tc2), ax = (int) (Math.random() * tc1), ay = (int) (Math.random() * tc2),
			tail = 5, hs, w, h;
	static ArrayList<int[]> trail = new ArrayList<int[]>();

	public PONG() throws IOException {
//		file=new File(Snake.class.getClassLoader().getResource("Snake/Snake.class").toString().substring(6).replace("Snake.class", "HighScore.txt"));
//		reader=new BufferedReader(new FileReader(file));
//		try {
//			hs=Integer.parseInt(reader.readLine());
//		} catch (NumberFormatException | IOException e2) {
//			// TODO Auto-generated catch block
//			hs=0;
//		}
//		reader.close();
		
		setPreferredSize(new Dimension(xlen, ylen));
		setBackground(Color.black);

		new Timer(0, (ActionEvent e) -> {
			game();
			repaint();
			try {
				Thread.sleep(1000 / 15);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}).start();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		trail.add(new int[] { px, py });
		JFrame f = new JFrame();
		f.addKeyListener(new keyListener());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("PONG");
		f.add(new PONG(), BorderLayout.CENTER);
		f.setResizable(false);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);

	}

	public static void game() {
		px += xv;
		py += yv;
		if (px < 0) {
			px = tc1 - 1;
		}
		if (px > tc1 - 1) {
			px = 0;
		}
		if (py < 0) {
			py = tc2 - 1;
		}
		if (py > tc2 - 1) {
			py = 0;
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.green);
		for (int i = 0; i < trail.size() - 1; i++) {
			g.fillRect((trail.get(i)[0] * gs) + 2, (trail.get(i)[1] * gs) + 2, gs - 4, gs - 4);
			if (trail.get(i)[0] == px && trail.get(i)[1] == py) {
				tail = 5;
			}
		}
		g.fillRect((trail.get(trail.size() - 1)[0] * gs) + 1, (trail.get(trail.size() - 1)[1] * gs) + 1, gs - 2,
				gs - 2);
		trail.add(new int[] { px, py });
		while (trail.size() > tail) {
			trail.remove(0);
		}

		if (ax == px && ay == py) {
			tail++;
			ax = (int) (Math.random() * tc1);
			ay = (int) (Math.random() * tc2);
			if (tail-5>hs) {
				hs++;
			}
		}

		g.setColor(Color.red);
		g.fillRect((ax * gs) + 1, (ay * gs) + 1, gs - 2, gs - 2);
		
		g.setColor(Color.white);
	    FontMetrics fm = g.getFontMetrics();
	    w = fm.stringWidth("Score: "+(tail-5));
	    h = fm.getAscent();
	    g.drawString("Score: "+(tail-5), (int) ((xlen/6)*1.5), 100);
	    w = fm.stringWidth("High Score: "+hs);
	    h = fm.getAscent();
	    g.drawString("High Score: "+hs, (int) ((xlen/6)*4), 100);
	}


}
