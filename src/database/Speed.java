package database;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Speed {
	
	public static double getSpeed(){
		
		try {
			URL url = new URL("http://blnarroganz.bplaced.de/Berliner_Aroganz_Vorlage_v2.jpg");
			InputStream in = url.openConnection().getInputStream();
			File file = new File("C:/Users/Justin/Documents/Mobile Anwendungen/newfile.jpg");
			OutputStream out = new FileOutputStream(file);
			byte[] buffer = new byte[1024];
			for (int n;(n = in.read(buffer)) != -1;out.write(buffer, 0, n));
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Path saveFile = Paths.get("C:\\Dinesh", fileName);
		//Files.copy(uc.getInputStream(), saveFile);
		return 1;
	}
	
}
