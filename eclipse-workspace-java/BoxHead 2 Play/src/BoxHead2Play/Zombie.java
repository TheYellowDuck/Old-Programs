package BoxHead2Play;

import java.util.List;

public class Zombie extends Entity {

	public Zombie(float x, float y) {
		super(x, y, 750, 12.5f, 100, 100, 200, 1.5f, 5, -1);
	}

	@Override
	public void update(Grid map, List<Entity> entities) {
		Entity player = entities.get(0);
//		xd=2;
//		yd=2;
		pathFind(player.x, player.y, map);
		super.update(map, entities);
	}

//	public void pathFind(float pxpos, float pypos, Grid g) {
//		int px = (int) (pxpos / Grid.TS);
//		int py = (int) (pypos / Grid.TS);
//		int xt = (int) (x / Grid.TS);
//		int yt = (int) (y / Grid.TS);
//		int[][] v = new int[g.grid.length][g.grid[0].length];
//		ArrayList<int[]> f = new ArrayList<int[]>(), nf;
//		if (xt - 1 >= 0 && yt - 1 >= 0 && g.grid[xt - 1][yt - 1] == 0) {
//			f.add(new int[] { xt - 1, yt - 1, 0 });
//			v[xt - 1][yt - 1] = 1;
//		}
//		if (xt - 1 >= 0 && yt + 1 < g.grid[0].length && g.grid[xt - 1][yt + 1] == 0) {
//			f.add(new int[] { xt - 1, yt + 1, 2 });
//			v[xt - 1][yt + 1] = 1;
//		}
//		if (xt + 1 < g.grid.length && yt + 1 < g.grid[0].length && g.grid[xt + 1][yt + 1] == 0) {
//			f.add(new int[] { xt + 1, yt + 1, 4 });
//			v[xt + 1][yt + 1] = 1;
//		}
//		if (xt + 1 < g.grid.length && yt - 1 >= 0 && g.grid[xt + 1][yt - 1] == 0) {
//			f.add(new int[] { xt + 1, yt - 1, 6 });
//			v[xt + 1][yt - 1] = 1;
//		}
//		if (xt - 1 >= 0 && g.grid[xt - 1][yt] == 0) {
//			f.add(new int[] { xt - 1, yt, 1 });
//			v[xt - 1][yt] = 1;
//		}
//		if (yt + 1 < g.grid[0].length && g.grid[xt][yt + 1] == 0) {
//			f.add(new int[] { xt, yt + 1, 3 });
//			v[xt][yt + 1] = 1;
//		}
//		if (xt + 1 < g.grid.length && g.grid[xt + 1][yt] == 0) {
//			f.add(new int[] { xt + 1, yt, 5 });
//			v[xt + 1][yt] = 1;
//		}
//		if (yt - 1 >= 0 && g.grid[xt][yt - 1] == 0) {
//			f.add(new int[] { xt, yt - 1, 7 });
//			v[xt][yt - 1] = 1;
//		}
//		while (f.size() != 0) {
//			nf = new ArrayList<int[]>();
//			for (int[] i : f) {
//				xt = i[0];
//				yt = i[1];
//				if (xt == px && yt == py) {
//					switch (i[2]) {
//					case 0:
//						xd = -1;
//						yd = -1;
//						break;
//					case 1:
//						xd = -1;
//						yd = 0;
//						break;
//					case 2:
//						xd = -1;
//						yd = 1;
//						break;
//					case 3:
//						xd = 0;
//						yd = 1;
//						break;
//					case 4:
//						xd = 1;
//						yd = 1;
//						break;
//					case 5:
//						xd = 1;
//						yd = 0;
//						break;
//					case 6:
//						xd = 1;
//						yd = -1;
//						break;
//					case 7:
//						xd = 0;
//						yd = -1;
//						break;
//					}
//					return;
//				}
//				if (xt + 1 < g.grid.length && yt + 1 < g.grid[0].length && v[xt + 1][yt + 1] == 0
//						&& g.grid[xt + 1][yt + 1] == 0) {
//					nf.add(new int[] { xt + 1, yt + 1, i[2] });
//					v[xt + 1][yt + 1] = 1;
//				}
//				if (xt - 1 >= 0 && yt - 1 >= 0 && v[xt - 1][yt - 1] == 0 && g.grid[xt - 1][yt - 1] == 0) {
//					nf.add(new int[] { xt - 1, yt - 1, i[2] });
//					v[xt - 1][yt - 1] = 1;
//				}
//				if (xt - 1 >= 0 && yt + 1 < g.grid[0].length && v[xt - 1][yt + 1] == 0 && g.grid[xt - 1][yt + 1] == 0) {
//					nf.add(new int[] { xt - 1, yt + 1, i[2] });
//					v[xt - 1][yt + 1] = 1;
//				}
//				if (xt + 1 < g.grid.length && yt - 1 >= 0 && v[xt + 1][yt - 1] == 0 && g.grid[xt + 1][yt - 1] == 0) {
//					nf.add(new int[] { xt + 1, yt - 1, i[2] });
//					v[xt + 1][yt - 1] = 1;
//				}
//				if (xt - 1 >= 0 && v[xt - 1][yt] == 0 && g.grid[xt - 1][yt] == 0) {
//					nf.add(new int[] { xt - 1, yt, i[2] });
//					v[xt - 1][yt] = 1;
//				}
//				if (yt + 1 < g.grid[0].length && v[xt][yt + 1] == 0 && g.grid[xt][yt + 1] == 0) {
//					nf.add(new int[] { xt, yt + 1, i[2] });
//					v[xt][yt + 1] = 1;
//				}
//				if (xt + 1 < g.grid.length && v[xt + 1][yt] == 0 && g.grid[xt + 1][yt] == 0) {
//					nf.add(new int[] { xt + 1, yt, i[2] });
//					v[xt + 1][yt] = 1;
//				}
//				if (yt - 1 >= 0 && v[xt][yt - 1] == 0 && g.grid[xt][yt - 1] == 0) {
//					nf.add(new int[] { xt, yt - 1, i[2] });
//					v[xt][yt - 1] = 1;
//				}
//			}
//			f = nf;
//		}
//
//	}

}
