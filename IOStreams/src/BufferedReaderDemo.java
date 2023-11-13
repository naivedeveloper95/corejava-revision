import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {
		int count = 0;

		try (FileReader fr = new FileReader(new File("D:\\Code\\MSVSQ.txt"));
				BufferedReader br = new BufferedReader(fr);) {

			String line;

			while ((line = br.readLine()) != null) {
				final StringTokenizer st = new StringTokenizer(line);
				System.out.println();
				while (st.hasMoreTokens()) {
					System.out.print(st.nextToken() + "");
					count++;
				}
			}
			System.out.println("\n\n\nNumber of words in the file are " + count);
		} catch (

		FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		} finally {
//			try {
//				fr.close();
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
	}

}
