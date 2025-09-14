import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;  
  
public class Image_Display {  
      
        public static void main(String[] args) {   
        	GraphicsEnvironment gfxEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        	GraphicsDevice gfxDev = gfxEnv.getDefaultScreenDevice();

//        	Rectangle r = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        	JFrame jf = new JFrame("Minecraft 1.16.4 - Singleplayer");
            jf.setUndecorated(true);
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            jf.setSize(r.width, r.height);
            jf.setIconImage(new ImageIcon("C:\\Users\\gzhan\\Desktop\\Minecraft Logo.png").getImage());
        	gfxDev.setFullScreenWindow(jf);

            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            GraphicsDevice device = env.getDefaultScreenDevice();
            device.setFullScreenWindow(jf);

            jf.add(new JLabel(new ImageIcon("C:\\Users\\gzhan\\Desktop\\PauseScreen.png")));
            jf.setVisible(true);
    }  
  
}  
