import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {

		Date date = new Date();
		DateFormat dfUS = DateFormat.getDateInstance(0, Locale.US);
		DateFormat dfUK = DateFormat.getDateInstance(0, Locale.UK);

		System.out.println("Date is US format is : " + dfUS.format(date));
		System.out.println("Date is UK format is : " + dfUK.format(date));

		DateFormat timeInstance0 = DateFormat.getTimeInstance(0);
		DateFormat timeInstance1 = DateFormat.getTimeInstance(1);
		DateFormat timeInstance2 = DateFormat.getTimeInstance(2);
		DateFormat timeInstance3 = DateFormat.getTimeInstance(3);

		System.out.println(timeInstance0.format(date));
		System.out.println(timeInstance1.format(date));
		System.out.println(timeInstance2.format(date));
		System.out.println(timeInstance3.format(date));

		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
		System.out.println(dateTimeInstance.format(date));

	}
}
