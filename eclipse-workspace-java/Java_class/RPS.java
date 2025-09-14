package programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.Map;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

public class RPS {
	static Map<Integer, String> array=Map.of(0, "\u001b[30;1m"+"Rock"+"\u001b[0m", 1, "\u001b[7m"+"Paper"+"\u001b[0m", 2, "\u001b[36;1m"+"Scissors"+"\u001b[0m");
	public static String loop="";
	public static Clip clipW, clipL, clipT;
	public static boolean check=false;
	public static boolean strat=false;
	public static int move;
	public static int umove;
	public static int i=0;
	public static int j=0;
	public static int l=0;
	public static int k=0;
	public static int n=0;
	public static int c=0;
	public static Timer timer;
	public static Timer timing;
	public static void generate() {
		for (int a=(loop.length()/2)-1; a<loop.length() && c>1; a++) {
			String str=loop.substring(a);
			String str2=str.concat(str);
			if (loop.contains(str2)) {
				char[] ca=str.toCharArray();
				switch (ca[0]-'0') {
				case 0:
					move=1;
					break;
				case 1:
					move=2;
					break;
				case 2:
					move=0;
					break;
				}
				return;
			}
		}
		if ((umove==l && check==true) || umove==move) {
			for (int i=0; i<array.size(); i++) {
				if (i!=j && i!=k)
					move=i;
			}
		}
		else if (umove==l && check==false && umove!=move)
			move=umove;
		else {
			move=new Random().nextInt(array.size());
		}
	}
	public static void checker() throws InterruptedException, MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		if (move==umove) {
			Thread.sleep(1000);
			System.out.println("\u001b[32;1m"+"Tie"+"\u001b[0m");
			n++;
			check=false;
		}
		else if ((move==0 && umove==1) || (move==1 && umove==2) || (move==2 && umove==0)) {
			playWin("Sounds\\Ta Da.wav");
			Thread.sleep(1000);
			clipT.start();
			System.out.println("\u001b[34;1m"+"Player "+"\u001b[0m"+"\u001b[33m"+"Wins!"+"\u001b[0m");
			i++;
			check=false;
		}
		else {
			playWin("Sounds\\Lose.wav");
			Thread.sleep(2000);
			clipT.start();
			System.out.println("\u001b[31;1m"+"AI "+"\u001b[0m"+"\u001b[31m"+"Wins"+"\u001b[0m");
			j++;
			check=true;
		}
	}
	public static void input() throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		k=umove;
		l=move;
		Thread.sleep(1000);
		System.out.println("\u001b[32;1m"+"Enter Your Move Enter \"Exit\" to Exit: "+"\u001b[0m");
		timer.restart();
		timing.restart();
        String num=input.readLine().substring(0, 1).toLowerCase();
        timing.stop();
        timer.stop();
		switch (num) {
		case "r":
			umove=0;
			break;
		case "p":
			umove=1;
			break;
		case "s":
			umove=2;
			break;
		case "1":
			umove=0;
			break;
		case "2":
			umove=1;
			break;
		case "3":
			umove=2;
			break;
		case "e":
			Thread.sleep(1000);
			System.out.println("\u001b[32;1m"+"Games Played: "+c+"\u001b[0m");
			Thread.sleep(1000);
			System.out.println("\u001b[34;1m"+"Player's "+"\u001b[0m"+"\u001b[33m"+"Wins: "+"\u001b[0m"+"\u001b[34;1m"+i+"\u001b[0m"+"\u001b[31;1m"+"		AI's "+"\u001b[0m"+"\u001b[31m"+"Wins: "+"\u001b[0m"+"\u001b[31;1m"+j+"\u001b[0m"+"\u001b[32;1m"+"		Ties: "+n+"\u001b[0m");
			Thread.sleep(1000);
			System.out.println("\u001b[32;1m"+"Thank You For Playing!"+"\u001b[0m");
			Thread.sleep(1000);
			System.out.println("\u001b[32;1m"+"Come Again!"+"\u001b[0m");
			System.exit(1);
		default:
			break;
		}
		loop=loop.concat(String.valueOf(umove));
		Thread.sleep(1000);
		System.out.println("\u001b[34;1m"+"Player's "+"\u001b[0m"+"\u001b[33m"+"Move: "+"\u001b[0m"+array.get(umove));
		Thread.sleep(1000);
		System.out.println("\u001b[31;1m"+"AI's "+"\u001b[0m"+"\u001b[31m"+"Move: "+"\u001b[0m"+array.get(move));
		checker();
		c++;
	}
	static ActionListener task=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			j++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("\u001b[32;1m"+"Games Played: "+c+"\u001b[0m");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("\u001b[34;1m"+"Player's "+"\u001b[0m"+"\u001b[33m"+"Wins: "+i+"\u001b[0m"+"\u001b[31;1m"+"	AI's "+"\u001b[0m"+"\u001b[31m"+"Wins: "+"\u001b[0m"+"\u001b[31;1m"+j+"\u001b[0m"+"\u001b[32;1m"+"	Ties: "+n+"\u001b[0m");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("\u001b[32;1m"+"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+"\u001b[0m");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("\u001b[32;1m"+"Enter Your Move Enter \"Exit\" to Exit: "+"\u001b[0m");
		}    
	};
	static ActionListener exit=new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			timer.stop();
			BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			System.out.println("\u001b[32;1m"+"Exit? Y/N: "+"\u001b[0m");
			try {
				if (input.readLine().toLowerCase().substring(0, 1)=="y") {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					System.out.println("\u001b[32;1m"+"Games Played: "+c+"\u001b[0m");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					System.out.println("\u001b[34;1m"+"Player's "+"\u001b[0m"+"\u001b[33m"+"Wins: "+"\u001b[0m"+"\u001b[34;1m"+i+"\u001b[0m"+"\u001b[31;1m"+"		AI's "+"\u001b[0m"+"\u001b[31m"+"Wins: "+"\u001b[0m"+"\u001b[31;1m"+j+"\u001b[0m"+"\u001b[32;1m"+"		Ties: "+n+"\u001b[0m");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("\u001b[32;1m"+"Thank You For Playing!"+"\u001b[0m");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("\u001b[32;1m"+"Come Again!"+"\u001b[0m");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println("\u001b[32;1m"+"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+"\u001b[0m");
					System.exit(1);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			timer.start();
		}    
	};
	static void playWin(String soundFile) throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
	    File f = new File(".\\" + soundFile);
	    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
	    clipW = AudioSystem.getClip();
	    clipW.open(audioIn);
	    clipW.start();
	}
	static void playLose(String soundFile) throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
	    File f = new File(".\\" + soundFile);
	    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
	    clipL = AudioSystem.getClip();
	    clipL.open(audioIn);
	    clipL.start();
	}
	static void playTheme(String soundFile) throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
	    File f = new File(".\\" + soundFile);
	    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
	    clipT = AudioSystem.getClip();
	    clipT.open(audioIn);
	    clipT.loop(Integer.MAX_VALUE);;
	}
	public static void main(String[] args) throws IOException, InterruptedException, UnsupportedAudioFileException, LineUnavailableException {
		// TODO Auto-generated method stub
		playTheme("Sounds\\Cute.wav");
		timer=new Timer(20*1000, task);
		timing=new Timer(5001*1000, exit);
		timer.stop();
		timing.stop();
		int loop=0;
		System.out.println("Enter 1 or r for "+array.get(0)+", 2 or p for "+array.get(1)+", 3 or s for "+array.get(2));
		System.out.println("\u001b[32;1m"+"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+"\u001b[0m");
		while (loop==0) {
			generate();
			Thread.sleep(1000);
			System.out.println("\u001b[31;1m"+"AI "+"\u001b[0m"+"\u001b[32;1m"+"Has Decided."+"\u001b[0m");
			input();
			Thread.sleep(1000);
			System.out.println("\u001b[32;1m"+"Games Played: "+c+"\u001b[0m");
			Thread.sleep(1000);
			System.out.println("\u001b[34;1m"+"Player's "+"\u001b[0m"+"\u001b[33m"+"Wins: "+"\u001b[0m"+"\u001b[34;1m"+i+"\u001b[0m"+"\u001b[31;1m"+"    AI's "+"\u001b[0m"+"\u001b[31m"+"Wins:"+j+"\u001b[0m"+"\u001b[32;1m"+"    Ties: "+n+"\u001b[0m");
			Thread.sleep(1000);
			System.out.println("\u001b[32;1m"+"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"+"\u001b[0m");
		}
	}

}
