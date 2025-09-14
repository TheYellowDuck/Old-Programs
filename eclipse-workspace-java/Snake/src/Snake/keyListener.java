package Snake;

import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class keyListener implements KeyListener {
	static Snake s;
	@Override
	public void keyPressed(KeyEvent k) {
		switch (k.getKeyCode()) {
		case 37:
		case 65:
			Snake.xv = -1;
			Snake.yv = 0;
			break;
		case 38:
		case 87:
			Snake.xv = 0;
			Snake.yv = -1;
			break;
		case 39:
		case 68:
			Snake.xv = 1;
			Snake.yv = 0;
			break;
		case 40:
		case 83:
			Snake.xv = 0;
			Snake.yv = 1;
			break;
		case 72:
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
		case 27:
			Snake.saveHS();
			break;
		}
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

