package entity;

import java.awt.Color;
//import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
//import java.awt.Image;
import java.awt.image.BufferedImage;
//import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;


 /**
 * The class Player extends entity
 */ 
public class Player extends Entity {
    
    GamePanel gp;
    KeyHandler keyH;
    
    public int screenX;
    public int screenY;
    
    int jumpCount;
    int maxJump;
    
    int jumpHeight;
    float xspeed;
    float yspeed;
    
    boolean jumping = false;
    boolean clickJump = false;

    BufferedImage[] jump, roll, shield;


/** 
 *
 * Player Constructor
 *
 * @param gp  the gp. 
 * @param keyH  the key H. 
 */
    public Player(GamePanel gp, KeyHandler keyH) { 


        this.gp = gp;
        this.keyH = keyH;
        
        screenX = (gp.screenWidth - gp.tileSize) / 2;
        screenY = (gp.screenHeight - gp.tileSize) / 2;
        
        solidArea = new Rectangle(10, 12, 27, 35);
        
        drawHitBox = true;

        getPlayerImage();
        setDefaultValues();

    }


/** 
 *
 * Sets the default values
 *
 */
    public void setDefaultValues() { 


        worldX = 3 * gp.tileSize;
        worldY = 98 * gp.tileSize;
        speed = 4;
        direction = 1;
        setIdle();
//        setJump();
        
        jumpCount = 0;
        maxJump = 2;
        
        jumpHeight = 48;
        xspeed = 0;
        yspeed = 0;
        
        newWorldX = worldX;
        newWorldY = worldY;

    }


/** 
 *
 * Gets the player image
 *
 */
    public void getPlayerImage() { 


        // BufferedImage idleTemp, walkTemp, attackTemp, deathTemp;

        try{
            
            idle = getSprites(ImageIO.read(getClass().getResourceAsStream("/Knight/noBKG_KnightIdle_strip.png")), 15, 64, 0);
            walk = getSprites(ImageIO.read(getClass().getResourceAsStream("/Knight/noBKG_KnightRun_strip.png")), 8, 96, 16);
            attack = getSprites(ImageIO.read(getClass().getResourceAsStream("/Knight/noBKG_KnightAttack_strip.png")), 22, 144, 32);
            death = getSprites(ImageIO.read(getClass().getResourceAsStream("/Knight/noBKG_KnightDeath_strip.png")), 15, 96, 16);
            
            jump = getSprites(ImageIO.read(getClass().getResourceAsStream("/Knight/noBKG_KnightJumpAndFall_strip.png")), 14, 144, new int[] {32, 32, 32, 36, 44, 53, 62, 75, 84, 88, 97, 95, 93, 93});

        } catch(IOException e) {
            e.printStackTrace();
        }

    }
    

/** 
 *
 * Sets to idle animation
 *
 */
    public void setIdle() { 

    	action = idle;
        spriteNum = 0;
        spriteFrameTime = 1e9 / 3.0;
        delta = 0;
        lastTime = System.nanoTime();
    }

/** 
 *
 * Sets to walk animation
 *
 */
    public void setWalk() { 

    	action = walk;
        spriteNum = 0;
        spriteFrameTime = 1e9 / 8.0;
        delta = 0;
        lastTime = System.nanoTime();
    }

/** 
 *
 * Sets to attack animation
 *
 */
    public void setAttack() { 

    	action = attack;
        spriteNum = 0;
        spriteFrameTime = 1e9 / 22.0;
        delta = 0;
        lastTime = System.nanoTime();
    }

/** 
 *
 * Sets to death animation
 *
 */
    public void setDeath() { 

    	action = death;
        spriteNum = 0;
        spriteFrameTime = 1e9 / 5.0;
        delta = 0;
        lastTime = System.nanoTime();
    }
    

/** 
 *
 * Sets to jump animation
 *
 */
    public void setJump() { 

    	action = jump;
        spriteNum = 2;
        spriteFrameTime = 1e9 / 16.0;
        delta = 0;
        lastTime = System.nanoTime();
    }


/** 
 *
 * Updates the player
 *
 */
    public void update() { 

    	
    	updatePlayer();
    	
    	updatePos();
    	
        updateSprite();
        
//        System.out.println(yspeed);

    }
    

/** 
 *
 * Update player position
 *
 */
    public void updatePlayer() { 


        // if (keyH.upPressed) 
        //     playerY -= speed;
        // if (keyH.downPressed) 
        //     playerY += speed;
        // if (keyH.leftPressed) 
        //     playerX -= speed;
        // if (keyH.rightPressed) 
        //     playerX += speed;
    	
        if (keyH.upPressed) {
        	if (!clickJump && jumpCount < maxJump) {
        		System.out.println("Jumped");
        		yspeed = 7;
        		if (jumpCount > 0)
        			yspeed += 2;
        		jumpCount ++;
        		jumping = true;
        	}
//                y -= speed;
        	clickJump = true;
        }
        else {
        	clickJump = false;
        }
        if (keyH.downPressed) {
        	
//                y += speed;
        }
        
        xspeed = 0;

        if (!keyH.recent.isEmpty()) {
            // System.out.println(keyH.recent);
            if (keyH.recent.get(0) == 3) { 
                xspeed -= speed;
                direction = 3;
            }
            if (keyH.recent.get(0) == 1) {
                xspeed += speed;
                direction = 1;
            }
            if (action != walk && !jumping) {
	            setWalk();
            }
        }
        else if (yspeed == 0 && !jumping) {
        	if (action != idle) {
	            setIdle();
            }
        }
        
        collisionOnX = false;
        collisionOnY = false;
        
        boolean onGround = gp.cChecker.checkTile(this, xspeed, yspeed);
        
        if (collisionOnX) {
        	worldX = newWorldX;
//        	if (xspeed > 0) {
//        		worldX = ((worldX + (int) xspeed + solidArea.x + solidArea.width) / gp.tileSize) * gp.tileSize - solidArea.x - solidArea.width;
//        	}
//        	else {
//        		worldX = ((worldX + (int) xspeed + solidArea.x) / gp.tileSize + 1) * gp.tileSize - solidArea.x;
//        	}
        }
        else {
	        worldX += xspeed;
        }
        if (collisionOnY) {
        	worldY = newWorldY;
//        	if (yspeed < 0) {
//        		worldY = ((worldY - (int) yspeed + solidArea.y + solidArea.height) / gp.tileSize) * gp.tileSize - solidArea.y - solidArea.height;
//        	}
//        	else {
//        		worldY = ((worldY - (int) yspeed + solidArea.y) / gp.tileSize + 1) * gp.tileSize - solidArea.y;
//        	}
        }
        else {
	        worldY -= yspeed;
        }
        
        if (onGround) {
        	jumpCount = 0;
        	clickJump = false;
        	yspeed = 0;
        }
        else if (gp.frameCount % 2 == 0) {
        	yspeed -= 1f;
        }
        
        
        if (yspeed > 0 && action != jump) {
        	setJump();
        }
        if (yspeed < -1f) {
        	action = jump;
        	spriteNum = 8;
        	delta = 0;
        	lastTime = System.nanoTime();
        }
        if (yspeed == 0 && jumping && spriteNum == action.length - 1)
        	jumping = false;
    }
    

/** 
 *
 * Update screen position
 *
 */
    public void updatePos() { 

    			
		int tileWorldXL = 0;
		int tileScreenXL = tileWorldXL - worldX + (gp.screenWidth - gp.tileSize) / 2;
		
		int tileWorldYU = 0;
		int tileScreenYU = tileWorldYU - worldY + (gp.screenHeight - gp.tileSize) / 2;
		
		int tileWorldXR = (gp.tileM.mapTileNum[0].length - 1) * gp.tileSize;
		int tileScreenXR = tileWorldXR - worldX + (gp.screenWidth - gp.tileSize) / 2;
		
		int tileWorldYD = (gp.tileM.mapTileNum.length - 1) * gp.tileSize;
		int tileScreenYD = tileWorldYD - worldY + (gp.screenHeight - gp.tileSize) / 2;
		
//		System.out.println(tileWorldX + " " + tileWorldY + " " + tileScreenX + " " + tileScreenY);
		
		if (tileScreenXL > 0) 
			screenX = worldX;
		else if (tileScreenXR < gp.screenWidth - gp.tileSize)
			screenX = gp.screenWidth - gp.tileSize + worldX - tileWorldXR;
		else
			screenX = (gp.screenWidth - gp.tileSize) / 2;
		
		if (tileScreenYU > 0) 
			screenY = worldY;
		else if (tileScreenYD < gp.screenHeight - gp.tileSize)
			screenY = gp.screenHeight - gp.tileSize + worldY - tileWorldYD;
		else
			screenY = (gp.screenHeight - gp.tileSize) / 2;
    }
    

/** 
 *
 * Update sprite frame
 *
 */
    public void updateSprite() { 

    	currTime = System.nanoTime();

        delta += (currTime - lastTime) / spriteFrameTime;
        lastTime = currTime;

        if (delta >= 1) {
            spriteNum ++;
            spriteNum %= action.length;
            delta --;
        }
    }


/** 
 *
 * Draws the player
 *
 * @param g2  the g2. 
 */
    public void draw(Graphics2D g2) { 


        // g2.setColor(Color.white);
        // g2.fillRect(x, y, gp.tileSize, gp.tileSize);

        // BufferedImage image = null;

    	if (direction == 1)
    		g2.drawImage(action[spriteNum], screenX, screenY, tileSize, tileSize, null);
    	if (direction == 3)
    		g2.drawImage(flip(action[spriteNum]), screenX, screenY, tileSize, tileSize, null);
    	if (drawHitBox) {
	    	g2.setColor(Color.white);
	    	g2.drawRect(screenX + solidArea.x, screenY + solidArea.y, solidArea.width, solidArea.height);
    	}
    }

}
