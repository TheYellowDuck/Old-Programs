package tile;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import main.GamePanel;


 /**
 * The class Tile manager
 */ 
public class TileManager {
	
	GamePanel gp;
	public Tile[] tile;
	public int mapTileNum[][];
//	int level = 0;
	

/** 
 *
 * the constructor. 
 *
 * @param gp  the gp. 
 */
	public TileManager(GamePanel gp) { 

		
		this.gp = gp;
		
		tile = new Tile[8];
		
		getTileImage();
		loadMap(2);
		
	}
	

/** 
 *
 * Load map
 *
 * @param level  the level. 
 */
	public void loadMap(int level) { 

		
		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/Maps/map" + String.format("%02d", level) + ".txt")));
			
			ArrayList<String[]> in = new ArrayList<>();
			String line;
			
			while ((line = br.readLine()) != null) {
				in.add(line.split(" "));
//				System.out.println(line);
			}
			
			mapTileNum = new int[in.size()][in.get(0).length];
			
			for (int i = 0; i < mapTileNum.length; i ++) {
				for (int j = 0; j < mapTileNum[0].length; j ++) {
//					System.out.println(i + " " + j + " " + in.get(i)[j]);
					mapTileNum[i][j] = Integer.parseInt(in.get(i)[j]);
				}
			}
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

/** 
 *
 * Gets the tile images
 *
 */
	public void getTileImage() { 

		
		try {
			
			tile[0] = new Tile();
			tile[0].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/Blank.png"));
			
			tile[1] = new Tile();
			tile[1].image = darken(ImageIO.read(getClass().getResourceAsStream("/Tiles/TileSet.png")).getSubimage(0, 0, 48, 48), 0.5f);
			tile[1].collision = true;
			tile[1].solidArea = new Rectangle(0, 0, 48, 48);

			tile[2] = new Tile();
			tile[2].image = darken(ImageIO.read(getClass().getResourceAsStream("/Tiles/TileSet.png")).getSubimage(0, 48, 48, 16), 0.5f);
			tile[2].collision = true;
			tile[2].solidArea = new Rectangle(0, 0, 48, 16);
			

//			tile[3] = new Tile();
//			tile[3].image = darken(ImageIO.read(getClass().getResourceAsStream("/Tiles/TileSet.png")).getSubimage(48, 48, 16, 16), 0.5f);
//			tile[3].collision = true;
//			tile[3].solidArea = new Rectangle(0, 0, 16, 16);
			

			tile[4] = new Tile();
			tile[4].image = ImageIO.read(getClass().getResourceAsStream("/Tiles/TileSet.png")).getSubimage(48, 32, 16, 16);
			
			tile[5] = new Tile();
			tile[5].image = darken(ImageIO.read(getClass().getResourceAsStream("/Tiles/TileSet.png")).getSubimage(0, 0, 48, 48), 0.75f);
			

			tile[6] = new Tile();
			tile[6].image = darken(ImageIO.read(getClass().getResourceAsStream("/Tiles/TileSet.png")).getSubimage(0, 48, 48, 16), 0.75f);
			

//			tile[7] = new Tile();
//			tile[7].image = darken(ImageIO.read(getClass().getResourceAsStream("/Tiles/TileSet.png")).getSubimage(48, 48, 16, 16), 0.75f);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

/** 
 *
 * Draw
 *
 * @param g2  the g2. 
 */
	public void draw(Graphics2D g2) { 

		
		int startX = (gp.player.worldX - gp.player.screenX) / gp.tileSize;
		int startY = (gp.player.worldY - gp.player.screenY) / gp.tileSize;
		int endX = (int) Math.ceil((gp.player.worldX + (gp.screenWidth - gp.player.screenX) + 0.0) / gp.tileSize); 
		int endY = (int) Math.ceil((gp.player.worldY + (gp.screenHeight - gp.player.screenY) + 0.0) / gp.tileSize); 
		
		int worldCol = startX;
		int worldRow = startY;
		
		
		while (worldRow < mapTileNum.length && worldCol < mapTileNum[0].length && worldRow <= endY && worldCol <= endX) {
			
			int tileNum = mapTileNum[worldRow][worldCol];
			
			int worldX = worldCol * gp.tileSize;
			int worldY = worldRow * gp.tileSize;
			int screenX = worldX - gp.player.worldX + gp.player.screenX;
			int screenY = worldY - gp.player.worldY + gp.player.screenY;
			
//			if (screenX + gp.tileSize > 0 &&
//				screenX - gp.tileSize < gp.screenWidth &&
//				screenY + gp.tileSize > 0 &&
//				screenY - gp.tileSize < gp.screenHeight) {
			
				g2.drawImage(tile[tileNum].image, screenX, screenY, tile[tileNum].image.getWidth(), tile[tileNum].image.getHeight(), null);
			
//			}
			worldCol ++;
			
			if (worldCol == mapTileNum[0].length || worldCol == endX + 1) {
				worldCol = 0;
				worldRow ++;
			}
			
		}
		
//		int col = startCol;
//		int row = startRow;
//		int x = 0;
//		int y = 0;
//		
//		while ((col - startCol) < gp.maxScreenCol && (row - startRow) < gp.maxScreenRow) {
//			
//			int tileNum = mapTileNum[row][col];
//			
//			g2.drawImage(tile[tileNum].image, x, y, tile[tileNum].image.getWidth(), tile[tileNum].image.getHeight(), null);
//			col ++;
//			x += gp.tileSize;
//			
//			if ((col - startCol) == gp.maxScreenCol) {
//				col = startCol;
//				x = 0;
//				row ++;
//				y += gp.tileSize;
//			}
//			
//		}
		
	}
	

/** 
 *
 * Darken
 *
 * @param img  the img. 
 * @param alpha  the alpha. 
 * @return BufferedImage
 */
	public BufferedImage darken(BufferedImage img, float alpha) { 

		
		Graphics2D g2 = img.createGraphics();
    	
    	g2.setColor(Color.black);
    	g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
    	
    	g2.fillRect(0, 0, img.getWidth(), img.getHeight());
    	
    	g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
    	
    	return img;
	}

}
