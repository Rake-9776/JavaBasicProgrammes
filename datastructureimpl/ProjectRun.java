package collection;

import java.util.Scanner;
import java.util.TreeMap;

class Contact {
	String cname;
	long cno;

	public Contact(String cname, long cno) {
		super();
		this.cname = cname;
		this.cno = cno;
	}

	@Override
	public String toString() {
		return "Contact [cname=" + cname + ", cno=" + cno + "]";
	}

}

class ContactBook {
	TreeMap tm = new TreeMap();

	public void addContact(Contact c) {
		tm.put(c.cname, c.cno);
		System.out.println("Successfully added..");
//		System.out.println("Cname = " + c.cname + " " + "Cno = " + c.cno);
		System.out.println(tm);
	}

	public void removeContact(String cname) {
		if (tm.isEmpty()) {
			System.out.println("Data List Is Empty..");
		} else {
			if (tm.containsKey(cname)) {
				tm.remove(cname);
				System.out.println("Success fully Removed..........");
			} else {
				System.out.println("Invalid Contact Name..");
			}
		}
	}

	public void showContact() {
		System.out.println(tm.values());
		
	}

	public void replaceContact(Contact c) {
		if (tm.containsKey(c.cname)) {
			tm.put(c.cname, c.cno);
			System.out.println("record replaced...");
		}
		else {
			System.out.println("record is not matchinng....");
		}
	}
}

public class ProjectRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		ContactBook cb = new ContactBook();
		while (flag) {
			System.out.println("1. AddContact\n2.DeleteContact\n3.ShowContact\n4.replaceContact\n5.exit");
			System.out.println("Enter Your Option..");
			int opt = sc.nextInt();

			switch (opt) {
			case 1: {
				System.out.println("Enter your Name");
				String name = sc.next();
				System.out.println("Enter Your Number");
				long num = sc.nextLong();
				cb.addContact(new Contact(name, num));
			}
				break;
			case 2: {
				System.out.println("Enter Your Name For Remove");
				String k = sc.next();
				cb.removeContact(k);
			}
				break;
			case 3: {
				cb.showContact();
			}
				break;
			case 4: {
				System.out.println("Enter your Name");
				String name = sc.next();
				System.out.println("Enter Your Number");
				long num = sc.nextLong();
                cb.replaceContact(new Contact(name, num));
			}
				break;
			case 5: {
				flag = false;
			}
				break;
				default:{
					System.out.println("Invalid Option");
				}
			}
		}
	}
}
