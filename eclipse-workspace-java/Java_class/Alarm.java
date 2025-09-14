package programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

public class Alarm {
	static int second, minute, hour, s=0, t=0, end, elapse=0, check=0;
	static GregorianCalendar date=new GregorianCalendar();
	static void playSound(String soundFile) throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException {
	    File f = new File(".\\" + soundFile);
	    AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
	    Clip clip = AudioSystem.getClip();
	    clip.open(audioIn);
	    clip.start();
	}
	public static void main(String[] args) throws MalformedURLException, UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {
		// TODO Auto-generated method stub
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The Hours Elapsed: ");
		String st=input.readLine().replace(" ", "").toLowerCase().replace("minutes", "m").replace("seconds", "s").replace("minute", "m").replace("second", "s").replace("hours", "h").replace("hour", "h").replace("mins", "m").replace("min", "m").replace("secs", "s").replace("sec", "s").replace(":", ".");
		String[] str=st.split(".");
		if (str.length!=3) {
			for (int i=0; i<str.length; i++) {
				System.out.println(str[i]);
				switch (str[i].substring(str[i].length()-1)) {
				case "h":
					elapse+=Integer.parseInt(str[i].substring(0, str[i].length()-1))*3600;
					System.out.println(elapse);
					break;
				case "m":
					elapse+=Integer.parseInt(str[i].substring(0, str[i].length()-1))*60;
					System.out.println(elapse);
					break;
				case "s":
					elapse+=Integer.parseInt(str[i].substring(0, str[i].length()-1));
					System.out.println(elapse);
					break;
				}
			}
		}
		else {
			for (int i=0; i<str.length; i++) {
				System.out.println(str[i]);
				switch (i) {
				case 0:
					t+=Integer.parseInt(str[i])*3600;
					System.out.println(elapse);
					break;
				case 1:
					t+=Integer.parseInt(str[i])*60;
					System.out.println(elapse);
					break;
				case 2:
					t+=Integer.parseInt(str[i]);
					System.out.println(elapse);
					break;
				}
			}
		}
		hour=date.get(Calendar.HOUR);
		minute=date.get(Calendar.MINUTE);
		second=date.get(Calendar.SECOND);
		int[] str2=new int[] {hour, minute, second};
		for (int i=0; i<str2.length; i++) {
			switch (i) {
			case 0:
				t+=str2[i]*3600;
				break;
			case 1:
				t+=str2[i]*60;
				break;
			case 2:
				t+=str2[i];
				break;
			}
		}
		end=t+elapse;
		s=t;
		while (s<end) {
			Thread.sleep(999, 99);
			s++;
			if (s==end) {
				playSound("Sounds\\Alarm.wav");
			}
		}
		
	}

}
