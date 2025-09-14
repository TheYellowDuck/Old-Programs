package Go;

import java.util.ArrayList;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	int len=600, player=1, x, y;
	
	int[][] G=new int[19][19], v=new int[19][19];
	
	ArrayList<ArrayList<int[]>> undo=new ArrayList<ArrayList<int[]>>();

	public void startSketch() {
		String[] processingArgs = { this.getClass().getName() };
		PApplet.runSketch(processingArgs, this);
	}

	@Override
	public void draw() {
		background(239, 235, 214);
		fill(0, 0, 0);
		for (int i=(len-(len/20))/19; i<len; i+=(len-(len/20))/19) {
			line(i, (len-(len/20))/19, i, len-(len/20));
			line((len-(len/20))/19, i, len-(len/20), i);
		}
		circle(intToPx(3), intToPx(3), 7);
		circle(intToPx(3), intToPx(9), 7);
		circle(intToPx(3), intToPx(15), 7);
		circle(intToPx(9), intToPx(3), 7);
		circle(intToPx(9), intToPx(9), 7);
		circle(intToPx(9), intToPx(15), 7);
		circle(intToPx(15), intToPx(3), 7);
		circle(intToPx(15), intToPx(9), 7);
		circle(intToPx(15), intToPx(15), 7);
//		try {
//			Thread.sleep(100000000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for (int i=0; i<19; i++) {
			for (int j=0; j<19; j++) {
				if (G[i][j]==1) {
					fill(0, 0, 0);
					circle(((i*(len-(len/20))/19)+len/20), ((j*(len-(len/20))/19)+len/20), (((len-(len/20))/19)/4)*3);
				}
				else if (G[i][j]==2) {
					fill(255, 255, 255);
					circle(((i*(len-(len/20))/19)+len/20), ((j*(len-(len/20))/19)+len/20), (((len-(len/20))/19)/4)*3);
				}
			}
		}
//		fill(135, 206, 235);
//		rect(intToPx(13), intToPx(18)+intToPx(0)/4, intToPx(3), intToPx(0));
//		fill(255, 255, 255);
//		text("Undo", intToPx(13)+intToPx(0)/4, intToPx(18)+intToPx(0)/4, intToPx(3), intToPx(0));
	}
	
	public void settings() {
		size(len+len/20, len+len/20);
		
	}
	
	public void mouseClicked() {
//		if (mouseX>=intToPx(13) && mouseX<=mouseX+intToPx(3) && mouseY>=intToPx(18)+intToPx(0)/4 && !undo.isEmpty()) {
//			undo();
//		}
//		else {
			x=pxToInt(mouseX);
			y=pxToInt(mouseY);
			double l=(mouseX-intToPx(x))*(mouseX-intToPx(x))+(mouseY-intToPx(y))*(mouseY-intToPx(y));
			if (l<((len/20)/2)*((len/20)/2) && x>-1 && y>-1 && x<19 && y<19 && G[x][y]==0) {
				G[x][y]=player;
				check(x, y, player);
				player=player==1?2:1;
			}
//		}
	}
	
//	public void undo() {
//		if (undo.size()>1) {
//			undo.remove(0);
//			G=undo.get(0);
//			player=player==1?2:1;
//		}
//		else if (undo.size()==1) {
//			G=new int[19][19];
//			undo.remove(0);
//			player=player==1?2:1;
//		}
//		for (int[][] i:undo) {
//			for (int[] j:i) {
//				for (int n:j) {
//					System.out.print(n+" ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//	}
	
	private void check(int b) {
		if (b==0) {
			for (int i=0; i<19; i++) {
				for (int j=0; j<19; j++) {
					if (v[i][j]==1) {
						G[i][j]=0;
						v[i][j]=0;
					}
				}
			}
		}
		else {
			for (int i=0; i<19; i++) {
				for (int j=0; j<19; j++) {
					v[i][j]=0;
				}
			}
		}
	}
	
	public void check(int x, int y, int c) {
		v[x][y]=2;
		if (x<18 && G[x+1][y]==(c==1?2:1)) {
			if (checkh(x+1, y, (c==1?2:1)))
				check(0);
			else
				check(1);
		}
		if (x>0 && G[x-1][y]==(c==1?2:1)) {
			if (checkh(x-1, y, (c==1?2:1)))
				check(0);
			else
				check(1);
		}
		if (y<18 && G[x][y+1]==(c==1?2:1)) {
			if (checkh(x, y+1, (c==1?2:1)))
				check(0);
			else
				check(1);
		}
		if (y>0 && G[x][y-1]==(c==1?2:1)) {
			if (checkh(x, y-1, (c==1?2:1)))
				check(0);
			else
				check(1);
		}
		v[x][y]=0;
		if ((x<1 || G[x-1][y]==(c==1?2:1)) && (x>17 || G[x+1][y]==(c==1?2:1)) && (y<1 || G[x][y-1]==(c==1?2:1)) && (y>17 || G[x+1][y]==(c==1?2:1)))
			G[x][y]=0;
	}
	
	private boolean checkh(int x, int y, int c) {
		if (x<0 || y<0 || x>18 || y>18)
			return true;
		if (v[x][y]!=0)
			return true;
		if (G[x][y]==(c==1?2:1))
			return true;
		v[x][y]=1;
		if (G[x][y]==0)
			return false;
		return checkh(x+1, y, c) && checkh(x-1, y, c) && checkh(x, y+1, c) && checkh(x, y-1, c);
	}
	
	public int intToPx(int i) {
		return (i+1)*(len-(len/20))/19;
	}
	
	public int pxToInt(int p) {
		double px=p;
		return (int) Math.round((px/((len-(len/20))/19))-1);
	}

}


