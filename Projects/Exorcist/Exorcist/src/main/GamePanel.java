package main;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import entity.Entity;
import entity.Player;
import tile.TileManager;


 /**
 * The class Game panel extends J panel implements runnable
 */ 
public class GamePanel extends JPanel implements Runnable {
	
	BufferedImage background;

	// SCREEN SETTINGS
    public final int originalTileSize = 16; // 16x16 tile
    public final int scale = 3;

    public final int tileSize = originalTileSize * scale; // 48x48 tile
    public final int maxScreenCol = 20;
    public final int maxScreenRow = 12;
    public final int screenWidth = tileSize * maxScreenCol; // 960 pixels
    public final int screenHeight = tileSize * maxScreenRow; // 576 pixels
    
    // WORLD SETTINGS
//    public final int maxWorldCol = 50;
//    public final int maxWorldRow = 50;
//    public final int worldWidth = tileSize * maxWorldCol;
//    public final int worldHeight = tileSize * maxWorldRow;

    // FPS
    int FPS = 60;
    public int frameCount = 0;

    public TileManager tileM = new TileManager(this);
    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    public CollisionChecker cChecker = new CollisionChecker(this);
    public Player player = new Player(this, keyH);


/** 
 *
 * Game panel Constructor
 *
 */
    public GamePanel() { 


        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
        
        try {
        	background = drawBackground(Entity.resize(ImageIO.read(getClass().getResourceAsStream("/Tiles/Background.png")), screenWidth, screenHeight));
        } catch (IOException e) {
        	e.printStackTrace();
        }

    }


/** 
 *
 * Start game thread
 *
 */
    public void startGameThread() { 


        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override

/** 
 *
 * Run
 *
 */
    public void run() { 


        // double drawInterval = 1e9 / FPS; // 0.01666666 seconds
        // double nextDrawTime = System.nanoTime() + drawInterval;
        
        // while(gameThread != null) {

        //     // 1 UPDATE; update information such as character positions
        //     update();

        //     // 2 DRAW: draw the screen with the updated information
        //     repaint();


        //     try {

        //         double remainingTime = nextDrawTime - System.nanoTime();
        //         remainingTime /= 1e6;

        //         if (remainingTime < 0)
        //             remainingTime = 0;

        //         Thread.sleep((long) remainingTime);

        //         nextDrawTime += drawInterval;
                
        //     } catch (InterruptedException e) {
        //         // TODO Auto-generated catch block
        //         e.printStackTrace();
        //     }

        // }

        double drawInterval = 1e9 / FPS; // 0.01666666 seconds
        double delta = 0;
        long lastTime = System.nanoTime();
        long currTime;
        

        int prevFrameCount = 0;
        long prevTime = System.nanoTime();

        
        while(gameThread != null) {

            currTime = System.nanoTime();

            delta += (currTime - lastTime) / drawInterval;
            lastTime = currTime;

            if (delta >= 1) {
                // 1 UPDATE; update information such as character positions
                update();

                // 2 DRAW: draw the screen with the updated information
                repaint();
                
                frameCount ++;

                delta --;
            }
            
            if (currTime >= prevTime + 1e9) {
            	System.out.println("FPS: " + (frameCount - prevFrameCount));
            	prevFrameCount = frameCount;
            	prevTime += 1e9;
            }

        }

    }

/** 
 *
 * Update
 *
 */
    public void update() { 


        player.update();

    }

/** 
 *
 * Paint component
 *
 * @param g  the g. 
 */
    public void paintComponent(Graphics g) { 


        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;
        
        g2.drawImage(background, 0, 0, null);
        darken(g2);
        
        tileM.draw(g2);
        player.draw(g2);

        g2.dispose();
    }
    

/** 
 *
 * Draw background
 *
 * @param img  the img. 
 * @return BufferedImage
 */
    public BufferedImage drawBackground(BufferedImage img) { 

    	
    	Graphics2D g2 = (Graphics2D) img.getGraphics();
    	
    	float alpha = 0.025f;
    	
    	g2.setColor(Color.black);
    	
    	int start = screenHeight / 15;
    	
    	for (int i = start; i > -start; i --) {
    		
    		Area a = new Area(new Rectangle(-(int) (start * (double) (screenWidth / screenHeight)), -start, screenWidth + 2 * (int) (start * (double) (screenWidth / screenHeight)), screenHeight + 2 * start));
    		a.subtract(new Area(new Ellipse2D.Double((int) (i * (double) (screenWidth / screenHeight)), i, screenWidth - 2 * (int) (i * (double) (screenWidth / screenHeight)), screenHeight - 2 * i)));
    		
    		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
    		g2.fill(a);
    		
    		i -= (int) Math.abs(i / 1.125);
    		
//    		alpha += 1.0 / (start);
//    		if (alpha > 1f) alpha = 1f;
    	}
    	
//    	Area a = new Area(new Rectangle(-start, -(int) (start * (double) (screenHeight / screenWidth)), screenWidth + 2 * start, screenHeight + 2 * (int) (start * (double) (screenHeight / screenWidth))));
//		a.subtract(new Area(new Ellipse2D.Double(start, (int) (start * (double) (screenHeight / screenWidth)), screenWidth - 2 * start, screenHeight - 2 * (int) (start * (double) (screenHeight / screenWidth)))));
//		g2.setColor(Color.white);
//		g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
//		g2.fill(a);
    	
    	return img;
    }
    

/** 
 *
 * Darken the image
 *
 * @param g2  the g2. 
 */
    public void darken(Graphics2D g2) { 

    	
    	float alpha = 0.5f;
    	
    	g2.setColor(Color.black);
    	g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
    	
    	g2.fillRect(0, 0, screenWidth, screenHeight);
    	
    	g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
    	
	}

}
