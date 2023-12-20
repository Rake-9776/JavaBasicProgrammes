package StringProgrammes;

public class Permutation {

	public static void main(String[] args) {
		String s = "abc";
		perm(s,0,2);
	}
	
	public static void perm(String s,int st,int ed) {
		if(st==ed) {
			System.out.println(s);
			return;
		}
		else {
			for(int i=st;i<=ed;i++) {
				String sw = swap(s,st,i);
				perm(sw, st+1, ed);
			}
		}
	}
	public static String swap(String s,int i,int j) {
		char[] a = s.toCharArray();
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return new String(a);
	}
}
