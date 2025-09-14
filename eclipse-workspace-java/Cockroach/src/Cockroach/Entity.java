package Cockroach;

import java.util.LinkedList;
import java.util.Queue;

public class Entity {
	
	int x, y, xv, yv, xl, yl, pd, dt = -1, still;
	int[][] directions = new int[][] {{-1, -1}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}};
	boolean clicked = false;
	
	public Entity(int xl, int yl) {
		this.xl = xl;
		this.yl = yl;
		int r = (int) (Math.random() * 4);
		if (r == 0) {
			x = 0;
			y = (int) (Math.random() * Cockroach.ylen);
			xv = 1;
			yv = 0;
			directions[1][0] = 0;
			still = 1;
		}
		else if (r == 1) {
			x = (int) (Math.random() * Cockroach.xlen);
			y = Cockroach.ylen;
			xv = 0;
			yv = -1;
			directions[3][1] = 0;
			still = 3;
		}
		else if (r == 2) {
			x = Cockroach.xlen;
			y = (int) (Math.random() * Cockroach.ylen);
			xv = -1;
			yv = 0;
			directions[5][0] = 0;
			still = 5;
		}
		else {
			x = (int) (Math.random() * Cockroach.xlen);
			y = 0;
			xv = 1;
			yv = 0;
			directions[7][1] = 0;
			still = 7;
		}
		pd = (r * 2 + 5) % 8;
	}
	public void direction(boolean bread) {
		if (bread && x >= 0 && y >= 0 && x < Cockroach.xlen && y < Cockroach.ylen) {
			if (x == Cockroach.breadx && y == Cockroach.bready) {
				pd = still;
				xv = 0;
				yv = 0;
				return;
			}
			int[][] v = new int[Cockroach.ylen][Cockroach.xlen];
			Queue<int[]> q = new LinkedList<>();
			v[x][y] = 1;
			if (x - 1 >= 0 && y - 1 >= 0 && v[x - 1][y - 1] == 0 && Cockroach.layout.layout[x - 1][y - 1] == 0) {
				if (x - 1 == Cockroach.breadx && y - 1 == Cockroach.bready) {
					pd = 0;
					xv = directions[0][0];
					yv = directions[0][1];
					return;
				}
				q.offer(new int[] {0, x - 1, y - 1});
				v[x - 1][y - 1] = 1;
			}
			if (x - 1 >= 0 && y + 1 < Cockroach.ylen && v[x - 1][y + 1] == 0 && Cockroach.layout.layout[x - 1][y + 1] == 0) {
				if (x - 1 == Cockroach.breadx && y + 1 == Cockroach.bready) {
					pd = 2;
					xv = directions[2][0];
					yv = directions[2][1];
					return;
				}
				q.offer(new int[] {2, x - 1, y + 1});
				v[x - 1][y + 1] = 1;
			}
			if (x + 1 < Cockroach.xlen && y + 1 < Cockroach.ylen && v[x + 1][y + 1] == 0 && Cockroach.layout.layout[x + 1][y + 1] == 0) {
				if (x + 1 == Cockroach.breadx && y + 1 == Cockroach.bready) {
					pd = 4;
					xv = directions[4][0];
					yv = directions[4][1];
					return;
				}
				q.offer(new int[] {4, x + 1, y + 1});
				v[x + 1][y + 1] = 1;
			}
			if (x + 1 < Cockroach.xlen && y - 1 >= 0 && v[x + 1][y - 1] == 0 && Cockroach.layout.layout[x + 1][y - 1] == 0) {
				if (x + 1 == Cockroach.breadx && y - 1 == Cockroach.bready) {
					pd = 6;
					xv = directions[6][0];
					yv = directions[6][1];
					return;
				}
				q.offer(new int[] {6, x + 1, y - 1});
				v[x + 1][y - 1] = 1;
			}
			if (x - 1 >= 0 && v[x - 1][y] == 0 && Cockroach.layout.layout[x - 1][y] == 0) {
				if (x - 1 == Cockroach.breadx && y == Cockroach.bready) {
					pd = 1;
					xv = directions[1][0];
					yv = directions[1][1];
					return;
				}
				q.offer(new int[] {1, x - 1, y});
				v[x - 1][y] = 1;
			}
			if (y + 1 < Cockroach.ylen && v[x][y + 1] == 0 && Cockroach.layout.layout[x][y + 1] == 0) {
				if (x == Cockroach.breadx && y + 1 == Cockroach.bready) {
					pd = 3;
					xv = directions[3][0];
					yv = directions[3][1];
					return;
				}
				q.offer(new int[] {3, x, y + 1});
				v[x][y + 1] = 1;
			}
			if (x + 1 < Cockroach.xlen && v[x + 1][y] == 0 && Cockroach.layout.layout[x + 1][y] == 0) {
				if (x + 1 == Cockroach.breadx && y == Cockroach.bready) {
					pd = 5;
					xv = directions[5][0];
					yv = directions[5][1];
					return;
				}
				q.offer(new int[] {5, x + 1, y});
				v[x + 1][y] = 1;
			}
			if (y - 1 >= 0 && v[x][y - 1] == 0 && Cockroach.layout.layout[x][y - 1] == 0) {
				if (x == Cockroach.breadx && y - 1 == Cockroach.bready) {
					pd = 7;
					xv = directions[7][0];
					yv = directions[7][1];
					return;
				}
				q.offer(new int[] {7, x, y - 1});
				v[x][y - 1] = 1;
			}
			while (q.size() != 0) {
				int[] i = q.poll();
				int s = i[0], n = i[1], m = i[2];
				if (n - 1 >= 0 && v[n - 1][m] == 0 && Cockroach.layout.layout[n - 1][m] == 0) {
					if (n - 1 == Cockroach.breadx && m == Cockroach.bready) {
						pd = s;
						xv = directions[s][0];
						yv = directions[s][1];
						return;
					}
					q.offer(new int[] {s, n - 1, m});
					v[n - 1][m] = 1;
				}
				if (m + 1 < Cockroach.ylen && v[n][m + 1] == 0 && Cockroach.layout.layout[n][m + 1] == 0) {
					if (n == Cockroach.breadx && m + 1 == Cockroach.bready) {
						pd = s;
						xv = directions[s][0];
						yv = directions[s][1];
						return;
					}
					q.offer(new int[] {s, n, m + 1});
					v[n][m + 1] = 1;
				}
				if (n + 1 < Cockroach.xlen && v[n + 1][m] == 0 && Cockroach.layout.layout[n + 1][m] == 0) {
					if (n + 1 == Cockroach.breadx && m == Cockroach.bready) {
						pd = s;
						xv = directions[s][0];
						yv = directions[s][1];
						return;
					}
					q.offer(new int[] {s, n + 1, m});
					v[n + 1][m] = 1;
				}
				if (m - 1 >= 0 && v[n][m - 1] == 0 && Cockroach.layout.layout[n][m - 1] == 0) {
					if (n == Cockroach.breadx && m - 1 == Cockroach.bready) {
						pd = s;
						xv = directions[s][0];
						yv = directions[s][1];
						return;
					}
					q.offer(new int[] {s, n, m - 1});
					v[n][m - 1] = 1;
				}
			}
		}
		else {
			int i = (int) (Math.random() * 3) - 1;
			int[] d = directions[(pd + i < 0 ? 7 : pd + i) % 8];
			pd = (pd + i < 0 ? 7 : pd + i) % 8;
			xv = d[0];
			yv = d[1];
		}
		
	}
}
