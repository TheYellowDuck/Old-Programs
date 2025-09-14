package Cockroach;

import java.awt.*;
import java.util.*;
import java.io.*;

import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class Cockroach extends JPanel {

	static int xlen = 600, ylen = 600, xv = 0, yv = 0, breadx = 0, bready = 0;
	public static ArrayList<Entity> entities = new ArrayList<>();
	static boolean bread = false;
	static Layout layout = new Layout();
	
	class Refresh extends TimerTask {
		int count1 = 0, count2 = 0;
	    public void run() {
	    	if (count1 == 5) {
	    		for (Entity entity : entities) {
	    			if (entity.dt == -1)
	    				entity.direction(bread);
	    		}
		    	if (count2 == 10) {
			    	if (entities.size() <= 20) {
//			    		System.out.println("Cockroach Spawned");
						entities.add(new Entity(35, 35));
			    	}
			    	count2 = -1;
		    	}
		    	count2++;
		    	count1 = -1;
	    	}
//	    	System.out.println("Page Refreshed");
			game();
			repaint();
			count1++;
	    }
	}

	public Cockroach() throws IOException {
		setPreferredSize(new Dimension(xlen, ylen));
		setBackground(new Color(230, 230, 230));
//		entities.add(new Entity(35, 35));
//		entities.get(0).x = xlen / 2;
//		entities.get(0).y = ylen / 2;
		Timer refresh = new Timer();
		refresh.schedule(new Refresh(), 0, 1000/50);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		Mouse mouse = new Mouse();
		f.addMouseListener(mouse);
		f.addMouseMotionListener(mouse);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Cockroach");
		f.add(new Cockroach(), BorderLayout.CENTER);
		f.setResizable(false);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	public static void game() {
		for (int i = 0; i < entities.size(); i++) {
			Entity entity = entities.get(i);
			if (entity.dt != -1) {
				if (entity.dt == 100) {
					entities.remove(i);
					i--;
				}
				else entity.dt++;
			}
			else {
				entity.x += entity.xv;
				entity.y += entity.yv;
			}
			if (entity.x + entity.xl / 2 < 0 || entity.x - entity.xl / 2 >= xlen || entity.y + entity.yl / 2 < 0 || entity.y - entity.yl / 2 >= ylen) {
				entities.remove(i);
				i--;
			}
		}
	}
	
	Color cockroach = new Color(50, 50, 50), breadcolor = new Color(198, 137, 88);

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Entity entity : entities) {
			if (entity.dt == -1) g.setColor(cockroach);
			else {
				g.setColor(new Color(130 + entity.dt, (int) Math.round(entity.dt * 2.3), (int) Math.round(entity.dt * 2.3)));
			}
			g.fillRect(entity.x - entity.xl / 2, entity.y - entity.yl / 2, entity.xl, entity.yl);
		}
		if (bread) {
			g.setColor(breadcolor);
			g.fillRect(breadx - 30 / 2, bready - 30 / 2, 30, 30);
		}
//		System.out.println("Painted");
	}

}
