package BoxHead2Play;

import java.util.ArrayList;
import java.util.List;

public class Entity {

	List<Gun> guns = new ArrayList<Gun>();

	final float SQRT_TWO_OVER_TWO = (float) (Math.sqrt(2) / 2);

	float die = 0;
	float x;
	float y;

	int maxhp;
	float currhp;
	float damage;

	float radius;

	float r, g, b;

	float speed;

	float xd;
	float yd;

	float enemy;

	public Entity(float x, float y, int maxhp, float radius, float r, float g, float b, float speed, float damage,
			float enemy) {
		super();
		this.x = x;
		this.y = y;
		this.maxhp = maxhp;
		this.radius = radius;
		this.r = r;
		this.g = g;
		this.b = b;
		this.currhp = maxhp;
		this.speed = speed;
		this.damage = damage;
		this.enemy = enemy;
	}

	public void update(Grid map, List<Entity> entities) {
		float coef = 1;
		if (Math.abs(xd) + Math.abs(yd) == 2) {
			coef = SQRT_TWO_OVER_TWO;
		}
		x += xd * coef * speed;
		y += yd * coef * speed;

		int tx = (int) (x / Grid.TS);
		int ty = (int) (y / Grid.TS);

		if (x - radius < 0)
			x = radius;
		else if (x + radius > map.grid.length * Grid.TS - 1)
			x = map.grid.length * Grid.TS - radius - 1;
		if (y - radius < 0)
			y = radius;
		else if (y + radius > map.grid[0].length * Grid.TS - 1)
			y = map.grid[0].length * Grid.TS - radius - 1;

		for (Entity e : entities) {
			if (this != e) {
				float distSquared = (e.x - x) * (e.x - x) + (e.y - y) * (e.y - y);
				if (distSquared < (e.radius + radius) * (e.radius + radius)) {
					if ((e.enemy < 0 && enemy > 0) || (e.enemy > 0 && enemy < 0)) {
						e.currhp -= damage;
						if (e.currhp <= 0)
							e.die = 1;
						else {
							currhp -= e.damage;
							if (currhp <= 0)
								die = 1;
						}
					}
					float dist = (float) Math.sqrt(distSquared);

					float f = (dist - e.radius + (e.radius + radius - dist) * radius / (e.radius + radius)) / dist;

					float midX = x + (e.x - x) * f;
					float midY = y + (e.y - y) * f;
					x = midX + (x - midX) * (0.1f + radius) / (f * dist);
					y = midY + (y - midY) * (0.1f + radius) / (f * dist);
					e.x = midX + (e.x - midX) * (0.1f + e.radius) / ((1 - f) * dist);
					e.y = midY + (e.y - midY) * (0.1f + e.radius) / ((1 - f) * dist);
				}
			}
		}

		for (int i = Math.max(0, ty - 1); i <= Math.min(map.grid.length - 1, ty + 1); i++) {
			for (int j = Math.max(0, tx - 1); j <= Math.min(map.grid[i].length - 1, tx + 1); j++) {
				if (map.grid[i][j] == 1) {
					float closestX = Math.max(j * Grid.TS, Math.min((j + 1) * Grid.TS, x));
					float closestY = Math.max(i * Grid.TS, Math.min((i + 1) * Grid.TS, y));

					float distSquared = (closestX - x) * (closestX - x) + (closestY - y) * (closestY - y);
					if (distSquared < radius * radius) {
						float dist = (float) Math.sqrt(distSquared);
						x = closestX + (x - closestX) * radius / dist;
						y = closestY + (y - closestY) * radius / dist;
					}
				}
			}
		}
	}

	public void display(Sketch s) {
		s.stroke(r - 100, g - 100, b - 100);
		s.fill(r, g, b);
		s.circle(x, y, 2 * radius);
	}

	public void displayhp(Sketch s) {
		float l = radius * 2 * currhp / maxhp;
		s.fill(172, 4, 4);
		s.rect(x - l / 2, y - radius - radius / 2, l, radius / 4);
	}

	public void pathFind(float pxpos, float pypos, Grid g) {
		int px = (int) (pxpos / Grid.TS);
		int py = (int) (pypos / Grid.TS);
		int xt = (int) (x / Grid.TS);
		int yt = (int) (y / Grid.TS);
		int[][] v = new int[g.grid.length][g.grid[0].length];
		v[yt][xt] = -1;
		ArrayList<int[]> f = new ArrayList<int[]>(), nf;
		if (xt - 1 >= 0 && yt - 1 >= 0 && g.grid[yt - 1][xt - 1] == 0 && g.grid[yt][xt - 1] == 0
				&& g.grid[yt - 1][xt] == 0) {
			f.add(new int[] { xt - 1, yt - 1 });
			v[yt - 1][xt - 1] = 1;
		}
		if (xt - 1 >= 0 && yt + 1 < g.grid[0].length && g.grid[yt + 1][xt - 1] == 0 && g.grid[yt][xt - 1] == 0
				&& g.grid[yt + 1][xt] == 0) {
			f.add(new int[] { xt - 1, yt + 1 });
			v[yt + 1][xt - 1] = 3;
		}
		if (xt + 1 < g.grid.length && yt + 1 < g.grid[0].length && g.grid[yt + 1][xt + 1] == 0
				&& g.grid[yt][xt + 1] == 0 && g.grid[yt + 1][xt] == 0) {
			f.add(new int[] { xt + 1, yt + 1 });
			v[yt + 1][xt + 1] = 5;
		}
		if (xt + 1 < g.grid.length && yt - 1 >= 0 && g.grid[yt - 1][xt + 1] == 0 && g.grid[yt][xt + 1] == 0
				&& g.grid[yt - 1][xt] == 0) {
			f.add(new int[] { xt + 1, yt - 1 });
			v[yt - 1][xt + 1] = 7;
		}
		if (xt - 1 >= 0 && g.grid[yt][xt - 1] == 0) {
			f.add(new int[] { xt - 1, yt });
			v[yt][xt - 1] = 2;
		}
		if (yt + 1 < g.grid[0].length && g.grid[yt + 1][xt] == 0) {
			f.add(new int[] { xt, yt + 1 });
			v[yt + 1][xt] = 4;
		}
		if (xt + 1 < g.grid.length && g.grid[yt][xt + 1] == 0) {
			f.add(new int[] { xt + 1, yt });
			v[yt][xt + 1] = 6;
		}
		if (yt - 1 >= 0 && g.grid[yt - 1][xt] == 0) {
			f.add(new int[] { xt, yt - 1 });
			v[yt - 1][xt] = 8;
		}
		while (f.size() != 0) {
			nf = new ArrayList<int[]>();
			for (int[] i : f) {
				xt = i[0];
				yt = i[1];
				int d = v[yt][xt];
				if (xt == px && yt == py) {
					switch (d) {
					case 1:
						xd = -1;
						yd = -1;
						break;
					case 2:
						xd = -1;
						yd = 0;
						break;
					case 3:
						xd = -1;
						yd = 1;
						break;
					case 4:
						xd = 0;
						yd = 1;
						break;
					case 5:
						xd = 1;
						yd = 1;
						break;
					case 6:
						xd = 1;
						yd = 0;
						break;
					case 7:
						xd = 1;
						yd = -1;
						break;
					case 8:
						xd = 0;
						yd = -1;
						break;
					}
//					for (int m = 0; m < v.length; m++) {
//						for (int w = 0; w < v[0].length; w++) {
//								if (g.grid[m][w] == 1)
//									System.out.print("E ");
//							if (m == py && w == px)
//								System.out.print("-2 ");
//							else
//								System.out.print(v[m][w] + " ");
//						}
//						System.out.println();
//					}
//					System.out.println();
					// try {
					// Thread.sleep(100);
					// } catch (InterruptedException e) {
					// // TODO Auto-generated catch block
					// e.printStackTrace();
					// }
					return;
				}
				if (xt - 1 >= 0 && v[yt][xt - 1] == 0 && g.grid[yt][xt - 1] == 0) {
					nf.add(new int[] { xt - 1, yt });
					v[yt][xt - 1] = d;
				}
				if (yt + 1 < g.grid[0].length && v[yt + 1][xt] == 0 && g.grid[yt + 1][xt] == 0) {
					nf.add(new int[] { xt, yt + 1 });
					v[yt + 1][xt] = d;
				}
				if (xt + 1 < g.grid.length && v[yt][xt + 1] == 0 && g.grid[yt][xt + 1] == 0) {
					nf.add(new int[] { xt + 1, yt });
					v[yt][xt + 1] = d;
				}
				if (yt - 1 >= 0 && v[yt - 1][xt] == 0 && g.grid[yt - 1][xt] == 0) {
					nf.add(new int[] { xt, yt - 1 });
					v[yt - 1][xt] = d;
				}
				// if (xt + 1 < g.grid.length && yt + 1 < g.grid[0].length && v[xt + 1][yt + 1]
				// == 0
				// && g.grid[xt + 1][yt + 1] == 0) {
				// nf.add(new int[] { xt + 1, yt + 1 });
				// v[xt + 1][yt + 1] = d;
				// }
				// if (xt - 1 >= 0 && yt - 1 >= 0 && v[xt - 1][yt - 1] == 0 && g.grid[xt - 1][yt
				// - 1] == 0) {
				// nf.add(new int[] { xt - 1, yt - 1 });
				// v[xt - 1][yt - 1] = d;
				// }
				// if (xt - 1 >= 0 && yt + 1 < g.grid[0].length && v[xt - 1][yt + 1] == 0 &&
				// g.grid[xt - 1][yt + 1] == 0) {
				// nf.add(new int[] { xt - 1, yt + 1 });
				// v[xt - 1][yt + 1] = d;
				// }
				// if (xt + 1 < g.grid.length && yt - 1 >= 0 && v[xt + 1][yt - 1] == 0 &&
				// g.grid[xt + 1][yt - 1] == 0) {
				// nf.add(new int[] { xt + 1, yt - 1 });
				// v[xt + 1][yt - 1] = d;
				// }
			}
			f = nf;
		}
	}

}
