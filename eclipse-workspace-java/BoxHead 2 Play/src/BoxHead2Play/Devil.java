package BoxHead2Play;

import java.util.List;

public class Devil extends Entity {

	public Devil(float x, float y) {
		super(x, y, 7500, 12.5f, 200, 0, 0, 1.5f, 7.5f, -2);
	}

	@Override
	public void update(Grid map, List<Entity> entities) {
		Entity player = entities.get(0);
		pathFind(player.x, player.y, map);
		super.update(map, entities);
	}

}
