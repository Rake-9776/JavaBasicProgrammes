package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write3 {

	public static void main(String[] args) throws IOException {
        FileOutputStream of = new FileOutputStream("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
	    String s = "Ankit";
	    byte[] bytes = s.getBytes();
//	    byte[] t =  new byte[65];
	    of.write(bytes);
	    of.close();
	}
}
