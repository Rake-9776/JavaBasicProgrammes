package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write2 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
		FileWriter fw = new FileWriter(f,true);  //for appending old data to new data 
		BufferedWriter bf = new BufferedWriter(fw);
		if(f.canWrite()) {
			bf.write("Ex batch is always Happy ): ..");
			bf.write(54);
		}
		else {
			System.out.println("we cant write..");
		}
		bf.newLine();
		bf.write("********************************");
		bf.close();
         
	}
}

/*
 *  1 . FileOutput - is for write the data
 *  2.  FileInput - is for read the data
*/
