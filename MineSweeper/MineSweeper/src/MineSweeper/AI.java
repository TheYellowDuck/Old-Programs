package MineSweeper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class AI {
	
	Square[][] squares;
	ArrayList<Square> order;
	Queue<Square> Q = new LinkedList<>();
	
	static int M;
	static long T;
	
	static class SquareCompare implements Comparator<Square> {
		
		@Override
		public int compare(Square a, Square b) {
			
			if (Double.compare(a.prob, b.prob) == 0) {
				if (a.x == b.x) 
					return Double.compare(a.y, b.y);
				else
					return Double.compare(a.x, b.x);
			}
			else 
				return Double.compare(a.prob, b.prob);
			
		}
		  // No need to override equals.
	}
	
	AI(int x, int y) {
		T = Main.totalCells;
		M = Main.Mines;
		squares = new Square[x][y];
		order = new ArrayList<>();
		for (int i = 0; i < x; i ++) {
			for (int j = 0; j < y; j ++) {
				squares[i][j] = new Square(i, j);
				order.add(squares[i][j]);
			}
		}
		
		for (Square i : order) {
			System.out.print(i.x + "   ");
		}
		System.out.println();
		for (Square i : order) {
			System.out.print(i.y + "   ");
		}
		System.out.println();
		for (Square i : order) {
			System.out.print(i.prob + " ");
		}
		System.out.println("\n");
	}
	
	public void remove(int x, int y) {
		order.remove(squares[x][y]);
	}
	
	public void calculate() {
		while (order.size() - Main.Mines > 0 && !Main.gameOver && !Main.win) {
			
			System.out.println(order.get(0).x + " " + order.get(0).y);
			
			Main.MS.game(order.get(0).x, order.get(0).y);
			
			order.remove(0);
			while (!Q.isEmpty()) {
				Square s = Q.poll();
				int n = 0;
				for (int i = -1; i <= 1; i ++) 
					if (s.x + i >= 0 && s.x + i < Main.XSquares) 
						for (int j = -1; j <= 1; j ++) 
							if (s.y + j >= 0 && s.y + j < Main.YSquares) 
								n++;
				for (int i = -1; i <= 1; i ++) 
					if (s.x + i >= 0 && s.x + i < Main.XSquares) 
						for (int j = -1; j <= 1; j ++) 
							if (s.y + j >= 0 && s.y + j < Main.YSquares) 
								squares[s.x + i][s.y + j].prob += ((double) Main.map[s.x][s.y] / n);
			}
			Collections.sort(order, new SquareCompare());
			
			for (Square i : order) {
				System.out.print(i.x + "   ");
			}
			System.out.println();
			for (Square i : order) {
				System.out.print(i.y + "   ");
			}
			System.out.println();
			for (Square i : order) {
				System.out.print(i.prob + " ");
			}
			System.out.println("\n");
			
			
			Main.M.repaint();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void update() {
		for (int i)
	}

	class Square {
		int x, y;
		Double prob;
		
		Square(int x, int y) {
			this.x = x;
			this.y = y;
			prob = M / (double) (T);
		}
		
	}
	
}
