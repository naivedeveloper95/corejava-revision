package mostwanted;

public class ClassCastExceptionDemo {

	public static void main(String[] args) {
		Object obj = new Object();
		if (obj instanceof String) {
			String s = (String) obj;
		}
	}

}
