package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(new File("D:\\Code\\emp.ser"));
			oos = new ObjectOutputStream(fos);

			final Employee emp = new Employee(1, "John", 100000, 12345);
			oos.writeObject(emp);

			System.out.println("Employee object serialized!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
