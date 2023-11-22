import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String date = sdf.format(new Date());

		System.out.println(date);

		String dateAsString = "10-12-2014";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		Date parsedDate = sdf1.parse(dateAsString);
		System.out.println(parsedDate);
	}

}
