package Cockroach;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Mouse extends MouseAdapter {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == 1) {
//			System.out.println(Cockroach.entities.size());
//			System.out.println(e.getX() + " " + e.getY());
			for (Entity entity : Cockroach.entities) 
				if (entity.dt == -1 && entity.x + entity.xl / 2 >= e.getX() - 7 && entity.x - entity.xl / 2 <= e.getX() - 7 && entity.y + entity.yl / 2 >= e.getY() - 30 && entity.y - entity.yl / 2 <= e.getY() - 30) 
					entity.dt = 0;
//					System.out.println("Squashed");
//				System.out.println(entity.x + " " + entity.y);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == 1) {
			for (Entity entity : Cockroach.entities) 
				if (!entity.clicked && entity.dt == -1 && entity.x + entity.xl / 2 >= e.getX() - 7 && entity.x - entity.xl / 2 <= e.getX() - 7 && entity.y + entity.yl / 2 >= e.getY() - 30 && entity.y - entity.yl / 2 <= e.getY() - 30) {
					entity.clicked = true;
					entity.x = e.getX() - 7;
					entity.y = e.getY() - 30;
//					System.out.println("Pressed");
				}
		}
		else Cockroach.bread = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getButton() == 1) {
			for (Entity entity : Cockroach.entities) 
				if (entity.clicked && entity.dt == -1 && entity.x + entity.xl / 2 >= e.getX() - 7 && entity.x - entity.xl / 2 <= e.getX() - 7 && entity.y + entity.yl / 2 >= e.getY() - 30 && entity.y - entity.yl / 2 <= e.getY() - 30) {
					entity.clicked = false;
//					System.out.println("Released");
				}
		}
		else Cockroach.bread = false;
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		Cockroach.breadx = e.getX() - 7;
		Cockroach.bready = e.getY() - 30;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Cockroach.breadx = e.getX() - 7;
		Cockroach.bready = e.getY() - 30;
		for (Entity entity : Cockroach.entities) 
			if (entity.clicked) {
				entity.x = e.getX() - 7;
				entity.y = e.getY() - 30;
//				System.out.println("Dragged");
			}
	}
}
