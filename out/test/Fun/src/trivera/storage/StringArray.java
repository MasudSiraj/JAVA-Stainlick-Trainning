package trivera.storage;


public class StringArray {

	private String data[] = new String[5];
	private int count;

	public int capacity() {
		return data.length - count;
	}

	public int size() {
		return count;
	}

	public String get(int index) {return data[index];}

	public void add(String string) {
		data[count++] = string;
	}

	public void remove(String string) {	}

	public void clear() {
		for(String s : data){
			s=null;
		}
	}

}
