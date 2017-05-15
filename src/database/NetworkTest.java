package database;

import java.net.SocketException;

public class NetworkTest {

	public static void main(String[] args) {
		
		try {
			System.out.println(Network.getIP());
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
