package programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.math.*;

public class Tic_Tac_Toe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String playagain="yes";
		while (playagain.contentEquals("yes")) {
			Scanner input1=new Scanner(System.in);
			boolean win=false;
			ArrayList<Integer> arraylist1=new ArrayList<Integer>();
			List<List<String>> board1=new ArrayList<List<String>>();
			List<String> board2=new ArrayList<String>();
			List<String> board3=new ArrayList<String>();
			List<String> board4=new ArrayList<String>();
			List<String> board5=new ArrayList<String>();
			List<String> board6=new ArrayList<String>();
			List<String> board=new ArrayList<String>();
			List<String> display=new ArrayList<String>();
			List<String> check=new ArrayList<String>();
			arraylist1.add(0, null);
			arraylist1.add(1, null);
			board2.add(0, " ");
			board2.add(1, "|");
			board2.add(2, " ");
			board2.add(3, "|");
			board2.add(4, " ");
			board1.add(0, board2);
			board3.add(0, "-");
			board3.add(1, "+");
			board3.add(2, "-");
			board3.add(3, "+");
			board3.add(4, "-");
			board1.add(1, board3);
			board4.add(0, " ");
			board4.add(1, "|");
			board4.add(2, " ");
			board4.add(3, "|");
			board4.add(4, " ");
			board1.add(2, board4);
			board5.add(0, "-");
			board5.add(1, "+");
			board5.add(2, "-");
			board5.add(3, "+");
			board5.add(4, "-");
			board1.add(3, board5);
			board6.add(0, " ");
			board6.add(1, "|");
			board6.add(2, " ");
			board6.add(3, "|");
			board6.add(4, " ");
			board1.add(4, board6);
			int[][] stop=new int[4][4];
			String b=null;
			if (playagain.contentEquals("yes")) {
				System.out.println("2 Players or 1 Player?");
				String num1=input1.nextLine();
				num1=num1.toLowerCase();
				num1=num1.replaceAll(" ", "");
				board2.set(0, " ");
				board2.set(2, " ");
				board2.set(4, " ");
				board1.set(0, board2);
				board4.set(0, " ");
				board4.set(2, " ");
				board4.set(4, " ");
				board1.set(2, board4);
				board6.set(0, " ");
				board6.set(2, " ");
				board6.set(4, " ");
				board1.set(4, board6);
				int p=0;
				String difficulty=null;
				if (num1.contentEquals("1player")) {
					System.out.println("Easy or Medium or Hard");
					difficulty=input1.nextLine();
					difficulty=difficulty.toLowerCase();
				}
				System.out.println("If Draw, O Wins");
				System.out.println(" 1 2 3"+"\n"+"1 | | "+"\n"+" -+-+-"+"\n"+"2 | | "+"\n"+" -+-+-"+"\n"+"3 | | ");
				System.out.println("Enter your placement corresponding to the graph (example: 2, 3 for row 2 and column 3)");
				while (num1.contentEquals("2players") && win==false) {
					String input=input1.nextLine();
					input=input.replaceAll(" ", "");
					String[] play=input.split(",");
					for(int i=0;i<play.length;i++) {
						arraylist1.set(i, Integer.parseInt(play[i]));
					}	
					int a=0;
					switch (arraylist1.get(0)) {
					case 1:
						board=board2;
						break;
					case 2:
						board=board4;
						break;
					case 3:
						board=board6;
						break;
					}
					switch (arraylist1.get(1)) {
					case 1:
						a=0;
						break;
					case 2:
						a=2;
						break;
					case 3:
						a=4;
						break;
					}
					
					if (stop[arraylist1.get(0)][arraylist1.get(1)]>1) {
						System.out.println("Square Taken");
						p--;
					}
					if (p%2==0 && stop[arraylist1.get(0)][arraylist1.get(1)]==0) {
						b="X";
						board.set(a, "X");
						stop[arraylist1.get(0)][arraylist1.get(1)]++;
					}
					if (p%2!=0 && stop[arraylist1.get(0)][arraylist1.get(1)]==0) {
						b="O";
						board.set(a, "O");
						stop[arraylist1.get(0)][arraylist1.get(1)]++;
					}
					for (int i=0; i<board1.size(); i++) {
						for (int j=0; j<board1.get(i).size() && stop[arraylist1.get(0)][arraylist1.get(1)]==1; j++) {
							switch (i) {
							case 0:
								display=board2;
								break;
							case 1:
								display=board3;
								break;
							case 2:
								display=board4;
								break;
							case 3:
								display=board5;
								break;
							case 4:
								display=board6;
								break;
							}
							System.out.print(display.get(j));
						}
						System.out.println();
					}
					p++;
				}
				while (win==false) {
					int a=0;	
					if (p%2==0 && difficulty.contentEquals("easy")) {
						String input=input1.nextLine();
						input=input.replaceAll(" ", "");
						String[] play=input.split(",");
						for(int i=0;i<play.length;i++) {
							arraylist1.set(i, Integer.parseInt(play[i]));
						}	
					}
					if (p%2!=0 && difficulty.contentEquals("medium")) {
						String input=input1.nextLine();
						input=input.replaceAll(" ", "");
						String[] play=input.split(",");
						for(int i=0;i<play.length;i++) {
							arraylist1.set(i, Integer.parseInt(play[i]));
						}	
					}
					switch (arraylist1.get(0)) {
					case 1:
						board=board2;
						break;
					case 2:
						board=board4;
						break;
					case 3:
						board=board6;
						break;
					}
					switch (arraylist1.get(1)) {
					case 1:
						a=0;
						break;
					case 2:
						a=2;
						break;
					case 3:
						a=4;
						break;
					}
					if (stop[arraylist1.get(0)][arraylist1.get(1)]>0) {
						System.out.println("Square Taken");
						p--;
					}
					if (p%2==0 && stop[arraylist1.get(0)][arraylist1.get(1)]==0 && difficulty.contentEquals("easy")) {
						b="X";
						board.set(a, "X");
						stop[arraylist1.get(0)][arraylist1.get(1)]++;
					}
					if (p%2!=0 && stop[arraylist1.get(0)][arraylist1.get(1)]==0 && difficulty.contentEquals("medium")) {
						b="O";
						board.set(a, "O");
						stop[arraylist1.get(0)][arraylist1.get(1)]++;
					}
					int random=0;
					int random2=0;
					boolean blank=false;
					if (p%2!=0 && difficulty.contentEquals("easy")) {
						while (blank==false) {
							random=(int)(Math.random()*3);
							random2=(int)(Math.random()*3);
							switch (random) {
							case 0:
								board=board2;
								break;
							case 1:
								board=board4;
								break;
							case 2:
								board=board6;
								break;
							}
							switch (random2) {
							case 1:
								a=0;
								break;
							case 2:
								a=2;
								break;
							case 3:
								a=4;
								break;
							}
							if (board.get(a).isBlank()) {
								blank=true;
								break;
							}
						}
						b="O";
						board.set(a, "O");
						arraylist1.set(0, random);
						arraylist1.set(1, random2);
						stop[arraylist1.get(0)][arraylist1.get(1)]++;
					}
					if (p%2==0 && difficulty.contentEquals("medium")) {
						while (blank==false) {
							random=(int)(Math.random()*3);
							random2=(int)(Math.random()*3);
							switch (random) {
							case 0:
								board=board2;
								break;
							case 1:
								board=board4;
								break;
							case 2:
								board=board6;
								break;
							}
							switch (random2) {
							case 1:
								a=0;
								break;
							case 2:
								a=2;
								break;
							case 3:
								a=4;
								break;
							}
							if (board.get(a).isBlank()) {
								blank=true;
								break;
							}
						}
						b="X";
						board.set(a, "X");
						arraylist1.set(0, random);
						arraylist1.set(1, random2);
						stop[arraylist1.get(0)][arraylist1.get(1)]++;
					}
					for (int i=0; i<board1.size(); i++) {
						for (int j=0; j<board1.get(i).size() && stop[arraylist1.get(0)][arraylist1.get(1)]==1; j++) {
							switch (i) {
							case 0:
								display=board2;
								break;
							case 1:
								display=board3;
								break;
							case 2:
								display=board4;
								break;
							case 3:
								display=board5;
								break;
							case 4:
								display=board6;
								break;
							}
							System.out.print(display.get(j));
						}
						System.out.println();
					}
					p++;
				}
				for (int i=0; i<board1.size() && stop[arraylist1.get(0)][arraylist1.get(1)]==1; i=i+2) {
					switch (i) {
					case 0:
						check=board2;
						break;
					case 2:
						check=board4;
						break;
					case 4:
						check=board6;
						break;
					}
					boolean cross=true;
					for (int j=0; j<check.size(); j=j+2) {
						if (!check.get(j).equals(b)) {
							cross=false;
							break;
						}
					}
					if (cross==true) {
						win=true;
					}
				}
				int j=0;
				int count=0;
				int count2=0;
				int count3=0;
				for (int i=0; i<board2.size() && win!=true && stop[arraylist1.get(0)][arraylist1.get(1)]==1; i=i+2) {
					j=0;
					count=0;
					for (j=0; j<board1.size(); j=j+2) {
						switch (j) {
						case 0:
							check=board2;
							break;
						case 2:
							check=board4;
							break;
						case 4:
							check=board6;
							break;
						}
						if (check.get(i)==b) {
							count++;
						}
					}
					if (count==3) {
						win=true;
						break;
					}
				}
				j=0;
				for (int i=0; i<board1.size() && win!=true && j<board1.get(i).size() && stop[arraylist1.get(0)][arraylist1.get(1)]==1; i=i+2) {
					switch (i) {
					case 0:
						check=board2;
						break;
					case 2:
						check=board4;
						break;
					case 4:
						check=board6;
						break;
					}
					if (check.get(j).contentEquals(b)) {
						count2++;
					}
					if (count2==3) {
						win=true;
					}
					j=j+2;
				}
				j=board2.size()-1;
				for (int i=0; i<board1.size() && win!=true && stop[arraylist1.get(0)][arraylist1.get(1)]==1; i=i+2) {
					switch (i) {
					case 0:
						check=board2;
						break;
					case 2:
						check=board4;
						break;
					case 4:
						check=board6;
						break;
					}
					if (check.get(j).contentEquals(b)) {
						count3++;
					}
					if (count3==3) {
						win=true;
					}
					j=j-2;
				}
				if (win==true) {
					System.out.println(b+" is the Winner");
				}
				boolean full=true;
				for (int i=0; i<board1.size(); i=i+2) {
					switch (i) {
					case 0:
						check=board2;
						break;
					case 2:
						check=board4;
						break;
					case 4:
						check=board6;
						break;
					}
					for (int l=0; l<check.size(); l=l+2) {
						if (check.get(l).isBlank()) {
							full=false;
							break;
						}
					}
				}
				if (full==true) {
					win=true;
					System.out.println("O is the Winner");
				}
			}
			if (win==true) {
				System.out.println("Play Again? (Enter Yes or No)");
				playagain=input1.nextLine();
				playagain=playagain.toLowerCase();
			}
		}
	}

}
