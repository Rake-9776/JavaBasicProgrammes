package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
                       ///converting Objct to ByteStream Type
class Student implements Serializable{
	int ind;
	String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int ind, String name) {
		super();
		this.ind = ind;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [ind=" + ind + ", name=" + name + "]";
	}
	
}

public class SerializationStream {

	public static void main(String[] args) throws FileNotFoundException {
			FileOutputStream of = new FileOutputStream("C:\\Users\\rakes\\eclipse\\jee-2022-12\\eclipse\\file\\java.txt");
			Student st = new Student(1,"rakesh");
			try {
				ObjectOutputStream f = new ObjectOutputStream(of);//for convert our java object to bytestream
				f.writeObject(st);
				f.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("done");
	}
}
