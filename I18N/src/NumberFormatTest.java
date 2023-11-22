import java.text.NumberFormat;

public class NumberFormatTest {

	public static void main(String[] args) {
		Double d = 12345763.7895;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(4);
		nf.setMaximumFractionDigits(4);
		nf.setMaximumIntegerDigits(4);
		System.out.println(nf.format(d));
	}

}
