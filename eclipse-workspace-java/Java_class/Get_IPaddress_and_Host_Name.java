package programs;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Get_IPaddress_and_Host_Name{
	public static void main(String args[]) {
		InetAddress ip;
		String hostname;
		try {
			ip=InetAddress.getLocalHost();
			hostname=ip.getHostName();
			System.out.println("Your IP Address: "+ip+"\n"+"Your Host Name: "+hostname);
		}
		catch (UnknownHostException exception) {
			exception.printStackTrace();
		}
	}
}
