package main;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


 /**
 * The class Main
 */ 
public class Main {


/** 
 *
 * Main
 *
 * @param args  the args. 
 */
	public static void main(String[] args) { 

		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("Exorcist");

		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);

		try {
			window.setIconImage(resize(ImageIO.read(gamePanel.getClass().getResourceAsStream("/Knight/noBKG_KnightIdle_strip.png")).getSubimage(16, 8, 40, 40), 64, 64));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		window.pack();

		window.setLocationRelativeTo(null);
		window.setVisible(true);

		gamePanel.startGameThread();

	}
	

/** 
 *
 * Resize
 *
 * @param img  the img. 
 * @param newW  the new W. 
 * @param newH  the new H. 
 * @return BufferedImage
 */
	public static BufferedImage resize(BufferedImage img, int newW, int newH) {  

        Image tmp = img.getScaledInstance(newW, newH, Image.SCALE_SMOOTH);
        BufferedImage dimg = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = dimg.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return dimg;
    }

}
