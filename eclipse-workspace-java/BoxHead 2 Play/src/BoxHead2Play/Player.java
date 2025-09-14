package BoxHead2Play;

public class Player extends Entity {

	int xp;
	int currgun = 0;

	public Player(float x, float y) {
		super(x, y, 1500, 12.5f, 100, 200, 100, 2.5f, 5, 1);
		xp = 0;
	}

//	@Override
//	public void update(Grid map, List<Entity> entities) {
//		float coef = 1;
//		if (Math.abs(xd) + Math.abs(yd) == 2) {
//			coef = SQRT_TWO_OVER_TWO;
//		}
//		x += xd * coef * speed;
//		y += yd * coef * speed;
//
//		int tx = (int) (x / Grid.TS);
//		int ty = (int) (y / Grid.TS);
//
//		if (x - radius < 0)
//			x = radius;
//		else if (x + radius > map.grid.length * Grid.TS - 1)
//			x = map.grid.length * Grid.TS - radius - 1;
//		if (y - radius < 0)
//			y = radius;
//		else if (y + radius > map.grid[0].length * Grid.TS - 1)
//			y = map.grid[0].length * Grid.TS - radius - 1;
//
//		for (int i = 1; i < entities.size(); i++) {
//			Entity e = entities.get(i);
//			float distSquared = (e.x - x) * (e.x - x) + (e.y - y) * (e.y - y);
//			if (distSquared < (e.radius + radius) * (e.radius + radius)) {
//				e.currhp -= damage;
//				if (e.currhp <= 0)
//					entities.remove(i--);
//				else {
//					currhp -= e.damage;
//					float dist = (float) Math.sqrt(distSquared);
//
//					float f = (dist - e.radius + (e.radius + radius - dist) * radius / (e.radius + radius)) / dist;
//
//					float midX = x + (e.x - x) * f;
//					float midY = y + (e.y - y) * f;
//					x = midX + (x - midX) * (0.1f + radius) / (f * dist);
//					y = midY + (y - midY) * (0.1f + radius) / (f * dist);
//					e.x = midX + (e.x - midX) * (0.1f + e.radius) / ((1 - f) * dist);
//					e.y = midY + (e.y - midY) * (0.1f + e.radius) / ((1 - f) * dist);
//				}
//			}
//		}
//
//		for (int i = Math.max(0, ty - 1); i <= Math.min(map.grid.length - 1, ty + 1); i++) {
//			for (int j = Math.max(0, tx - 1); j <= Math.min(map.grid[i].length - 1, tx + 1); j++) {
//				if (map.grid[i][j] == 1) {
//					float closestX = Math.max(j * Grid.TS, Math.min((j + 1) * Grid.TS, x));
//					float closestY = Math.max(i * Grid.TS, Math.min((i + 1) * Grid.TS, y));
//
//					float distSquared = (closestX - x) * (closestX - x) + (closestY - y) * (closestY - y);
//					if (distSquared < radius * radius) {
//						float dist = (float) Math.sqrt(distSquared);
//						x = closestX + (x - closestX) * radius / dist;
//						y = closestY + (y - closestY) * radius / dist;
//					}
//				}
//			}
//		}
//	}

}
