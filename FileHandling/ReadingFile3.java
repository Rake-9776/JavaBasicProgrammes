package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile3 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
	
	     FileReader fr = new FileReader(f);
	     BufferedReader bf = new BufferedReader(fr);
	     if(f.canRead()) {
	    	 String r = bf.readLine();
	    	 while(r!=null) {
	    		 System.out.println(r);
	    		 r = bf.readLine();
	    	 }
	     }
	     else {
	    	 System.out.println("cant Read");
	     }
	     fr.close();
	}
}
//defaullt return value of FileReader is int
//defaullt return value of FileInputStream is int
//defaullt return value of BufferReader is String