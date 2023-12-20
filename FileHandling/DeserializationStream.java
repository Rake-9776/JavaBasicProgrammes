package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

                    ///converting ByteStream to Object Type
public class DeserializationStream {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream of = new FileInputStream("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
		
//		Student o;
//		try(ObjectInputStream f = new ObjectInputStream(of)) {
////			ObjectInputStream f = new ObjectInputStream(of);
//			o = (Student) f.readObject();
//			System.out.println(o);
//		} catch (ClassNotFoundException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("done");
		
		Student o;
		try(ObjectInputStream f = new ObjectInputStream(of)) {
//			ObjectInputStream f = new ObjectInputStream(of);
			o = (Student) f.readObject();
			System.out.println(o);
			System.out.println("done");
		} 
	}
}
