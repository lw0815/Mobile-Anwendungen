package database;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress; 
import java.net.NetworkInterface; 
import java.net.SocketException; 
import java.net.UnknownHostException; 
import java.util.ArrayList; 
import java.util.Collections;

public class Network {
	
	Network(){
		
	}
	
	public static String getIP() throws SocketException{
		String result="";
		try {
			result = InetAddress.getLocalHost()+"";
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
		return result;
	}
}
