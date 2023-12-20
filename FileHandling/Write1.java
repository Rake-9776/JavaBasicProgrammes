package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write1 {

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
		file.write("good boy....\nHis Name Is :Rakesh");
		file.close();
	}
}
