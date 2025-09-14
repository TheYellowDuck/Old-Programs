package PONG;

import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class keyListener implements KeyListener {
	static PONG s;
	static FileWriter writer;
	@Override
	public void keyPressed(KeyEvent k) {
		switch (k.getKeyCode()) {
		case 37:
		case 65:
			PONG.xv = -1;
			PONG.yv = 0;
			break;
		case 38:
		case 87:
			PONG.xv = 0;
			PONG.yv = -1;
			break;
		case 39:
		case 68:
			PONG.xv = 1;
			PONG.yv = 0;
			break;
		case 40:
		case 83:
			PONG.xv = 0;
			PONG.yv = 1;
			break;
//		case 72:
//			try {
//				s=new Snake();
//				writer=new FileWriter(Snake.file);
//				writer.write("0");
//				writer.close();
//				Snake.repaint();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			break;
//		case 27:
//			try {
//				writer=new FileWriter(Snake.file);
//				writer.write(String.valueOf(Snake.hs));
//				writer.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.exit(0);
//			break;
//		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}

