package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


 /**
 * The class Key handler implements key listener
 */ 
public class KeyHandler implements KeyListener {

    public boolean upPressed, downPressed, leftPressed, rightPressed;
    public ArrayList<Integer> recent = new ArrayList<>(4);

    // int count = 0;

    @Override

/** 
 *
 * Key typed
 *
 * @param e  the e. 
 */
    public void keyTyped(KeyEvent e) { 

    }

    @Override

/** 
 *
 * Key pressed
 *
 * @param e  the e. 
 */
    public void keyPressed(KeyEvent e) { 


        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W || code == KeyEvent.VK_SPACE) {
            upPressed = true;
//            if (!recent.contains(0))
//                recent.add(0, 0);

            // if (!downPressed)
            //     count ++;
            // else
            //     count --;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = true;
//            if (!recent.contains(2))
//                recent.add(0, 2);

            // if (!upPressed)
            //     count ++;
            // else
            //     count --;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = true;
            if (!recent.contains(3))
                recent.add(0, 3);

            // if (!rightPressed)
            //     count ++;
            // else
            //     count --;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = true;
            if (!recent.contains(1))
                recent.add(0, 1);

            // if (!leftPressed)
            //     count ++;
            // else
            //     count --;
        }

    }

    @Override

/** 
 *
 * Key released
 *
 * @param e  the e. 
 */
    public void keyReleased(KeyEvent e) { 

        
        int code = e.getKeyCode();

        if (code == KeyEvent.VK_W || code == KeyEvent.VK_SPACE) {
            upPressed = false;
//            recent.remove((Integer)0);

            // if (!downPressed)
            //     count --;
            // else
            //     count ++;
        }
        if (code == KeyEvent.VK_S) {
            downPressed = false;
//            recent.remove((Integer)2);
            
            // if (!upPressed)
            //     count --;
            // else
            //     count ++;
        }
        if (code == KeyEvent.VK_A) {
            leftPressed = false;
            recent.remove((Integer)3);
            
            // if (!rightPressed)
            //     count --;
            // else
            //     count ++;
        }
        if (code == KeyEvent.VK_D) {
            rightPressed = false;
            recent.remove((Integer)1);
            
            // if (!leftPressed)
            //     count --;
            // else
            //     count ++;
        }

    }
    
}
