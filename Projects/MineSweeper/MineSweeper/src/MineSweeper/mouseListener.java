package MineSweeper;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class mouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (!Main.gameOver || !Main.win) {
			int x = e.getY() / Main.scale - 1;
			int y = (e.getX() - 7) / Main.scale;
			if (e.getY() - 30 >= x * Main.scale + Main.spacing && e.getY() - 30 <= (x + 1) * Main.scale - Main.spacing - 1 && 
					e.getX() - 7 >= y * Main.scale + Main.spacing && e.getX() - 7 <= (y + 1) * Main.scale - Main.spacing - 1 &&
					x >= 0 && x < Main.XSquares &&
					y >= 0 && y < Main.YSquares) {
				if (e.getButton() == 1) 
					Main.MS.game(x, y);
				else if (e.getButton() == 3 && (Main.clickedOn[x][y] == 0 || Main.clickedOn[x][y] == 2)) {
					Main.clickedOn[x][y] = (Main.clickedOn[x][y] + 2) % 4;
					if (Main.clickedOn[x][y] == 0) {
						if (Main.map[x][y] == -1) 
							Main.MS.correct --;
						else
							Main.MS.incorrect --;
					}
					else {
						if (Main.map[x][y] == -1) 
							Main.MS.correct ++;
						else
							Main.MS.incorrect ++;
					}
				}
				winCondition();
				Main.M.repaint();
			}
		}
	}
	
	public void winCondition() {
		if (Main.clickcount == Main.totalCells - Main.Mines || (Main.MS.correct == Main.Mines && Main.MS.incorrect == 0)) {
			Main.win = true;
			Main.MS.clickedMine();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
