package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fr = new FileInputStream("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
		int n = fr.read();
		while(n!=-1) {
			System.out.print((char)n);
			n= fr.read();
		}
		fr.close();
	}
}
