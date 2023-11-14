package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("D:\\Code\\emp.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object readObject = ois.readObject();

		Employee emp = (Employee) readObject;

		System.out.println("Employee Id " + emp.id);
		System.out.println("Employee Name " + emp.name);
		System.out.println("Employee Salary " + emp.salary);
		System.out.println("Employee SSN " + emp.ssn);
	}
}
