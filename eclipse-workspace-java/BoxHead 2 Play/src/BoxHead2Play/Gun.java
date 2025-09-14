package BoxHead2Play;

import java.util.List;

public class Gun {

	Entity shooter;
	Sketch sketch;
	float damage;
	int maxbull;
	int currbull;
	int bim;
	float size;
	float xd = 0;
	float yd = -1;
	float x;
	float y;
	float b;
	float len;

	public Gun(Entity shooter, Sketch sketch, float damage, int maxbull, int bim, float size) {
		this.shooter = shooter;
		this.sketch = sketch;
		this.damage = damage;
		this.maxbull = maxbull;
		this.currbull = maxbull;
		this.bim = bim;
		this.size = size;
	}

	public void shoot(List<Entity> entities) {
		len(shooter.x, shooter.y);
		for (int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			if (e.enemy != shooter.enemy) {
				float dot = (((e.x - shooter.x) * (x - shooter.x)) + ((e.y - shooter.y) * (y - shooter.y))) / len;
				float cx = shooter.x + (dot * (x - shooter.x));
				float cy = shooter.y + (dot * (y - shooter.y));
				if (Math.min(x, shooter.x) <= cx && Math.max(x, shooter.x) >= cx && Math.min(y, shooter.y) <= cy
						&& Math.max(y, shooter.y) >= cy) {
					e.currhp -= damage;
					if (e.currhp <= 0)
						entities.remove(i--);
				}
			}
		}
	}

	public void len(float xs, float ys) {
		b = ys - (xd * yd * xs);
		x = 0;
		y = 0;
		if (xd == 0 && yd == 1) {
			x = xs;
			y = 599 - ys;
		} else if (xd == 1 && yd == 0) {
			x = 599;
			y = ys;
		} else if ((xd == 0 || xd == 1) && yd == -1) {
			x = xs;
			y = 0;
		} else if (xd == -1 && (yd == 0 || yd == 1)) {
			x = 0;
			y = ys;
		} else if (xd == 1 && yd == 1) {
			x = 599;
			y = 599;
		} else if (xd == -1 && yd == -1) {
			x = 0;
			y = 0;
		}
		System.out.println(xd + " " + yd + " " + x + " " + y);
		len = x * x + y + y;
		sketch.fill(0, 0, 0);
		sketch.line(xs, ys, x, y);
	}

	public void update() {
		if (shooter.xd != 0 || shooter.yd != 0) {
			xd = shooter.xd;
			yd = shooter.yd;
		}
	}

}
