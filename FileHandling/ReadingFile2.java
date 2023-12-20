package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile2 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
		FileReader r = new FileReader(f);
         
		char[] ch  =  new char[(int)f.length()];  //it will give char
		r.read(ch);
		for(char c:ch) {
			System.out.print(c);
		}
		r.close();
		
		
	}
}
