package datastructureimpl;

public class ArrayList2 {

	public Object[] arr = new Object[5];
	public int index = 0;
	public void add(Object ele) {
		if (index >= arr.length)
			increase(); /// if we want to increase the size of array
		arr[index] = ele;
		System.out.println(index);
		index++;
	}
	public Object get(int ind) {
		if (ind <= -1 || ind >= arr.length) {
			throw new ArrayIndexOutOfRange();
		}
		return arr[ind];
	}
	public int size() {
		return index;
	}
	public void increase() {
		Object[] temp = new Object[arr.length * 3 / 2];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i]; /// All Array elemnts from(arr) to new array(temp) copy
		}
		arr = temp; //// new temp array become arr and that previous array goes to GC
	}
	public void add(int ind, Object ele) {
		for (int i = size() - 1; i >= ind; i--) {
			arr[i + 1] = arr[i];
		}
		arr[ind] = ele;
		index++;
	}
	public void remove(int ind) {
		for (int i = ind + 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[--index] = null;
	}
	public static void main(String[] args) {
		ArrayList2 ar = new ArrayList2();
//		ar.add("rakesh");
//		ar.add("rahul");
//		ar.add("rahul");
//		ar.add(12);
		ar.add("raks");
		System.out.println(ar.size());
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
	}

}

class ArrayIndexOutOfRange extends RuntimeException {
}
