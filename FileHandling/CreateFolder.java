package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFolder{
	
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
//		System.out.println(file.mkdir());   //for make a folder
//		System.out.println(file.createNewFile());  //for create a file
		System.out.println(file.canExecute());
//		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
	}
}

