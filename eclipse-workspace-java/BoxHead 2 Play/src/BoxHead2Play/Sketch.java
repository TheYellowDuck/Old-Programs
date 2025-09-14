package BoxHead2Play;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;

public class Sketch extends PApplet {

	Grid map = new Grid();

	Player p = new Player(300, 300);
	List<Entity> entities = new ArrayList<>();

	public void startSketch() {
		String[] processingArgs = { this.getClass().getName() };
		PApplet.runSketch(processingArgs, this);
	}

	@Override
	public void settings() {
		size(600, 600);
	}

	@Override
	public void setup() {
//		p.guns.add(new Pistol(p, this));
		entities.add(p);
		entities.add(new Zombie(300, 0));
		entities.add(new Zombie(300, 0));
//		entities.add(new Devil(299, 599));
	}

	@Override
	public void draw() {
		background(225, 225, 225);
		map.display(this);
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.update(map, entities);
			if (e.die == 1) {
				entities.remove(i--);
				if (entities.get(0).enemy != 1)
					System.exit(0);
			}
			for (Gun j : e.guns)
				j.update();
		}
		for (Entity e : entities)
			e.display(this);
		for (Entity e : entities)
			e.displayhp(this);
	}

	boolean wPressed = false;
	boolean aPressed = false;
	boolean sPressed = false;
	boolean dPressed = false;

	@Override
	public void keyPressed() {
		switch (keyCode) {
		case 87: // W
		case 38:
			if (!wPressed) {
				p.yd -= 1;
				wPressed = true;
			}
			break;
		case 65: // A
		case 37:
			if (!aPressed) {
				p.xd -= 1;
				aPressed = true;
			}
			break;
		case 83: // S
		case 40:
			if (!sPressed) {
				p.yd += 1;
				sPressed = true;
			}
			break;
		case 68: // D
		case 39:
			if (!dPressed) {
				p.xd += 1;
				dPressed = true;
			}
			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased() {
		switch (keyCode) {
		case 32:
			p.guns.get(p.currgun).shoot(entities);
			break;
		case 87: // W
		case 38:
			if (wPressed) {
				p.yd += 1;
				wPressed = false;
			}
			break;
		case 65: // A
		case 37:
			if (aPressed) {
				p.xd += 1;
				aPressed = false;
			}
			break;
		case 83: // S
		case 40:
			if (sPressed) {
				p.yd -= 1;
				sPressed = false;
			}
			break;
		case 68: // D
		case 39:
			if (dPressed) {
				p.xd -= 1;
				dPressed = false;
			}
			break;
		default:
			break;
		}
	}

}
