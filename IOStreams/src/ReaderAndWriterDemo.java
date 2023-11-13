import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {
		FileReader fr = null;
		FileWriter fw = null;

		fr = new FileReader(new File("D:\\Code\\MSVSQ.txt"));
		fw = new FileWriter(new File("D:\\Code\\MSVSQ_write.txt"));

		int ch;

		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}

		fr.close();
		fw.close();
	}

}
