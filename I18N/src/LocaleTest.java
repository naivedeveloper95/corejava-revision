import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry() + " " + loc.getLanguage());
		System.out.println(loc.getDisplayCountry() + " " + loc.getDisplayLanguage());

		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault().getCountry());

		String[] isoCountries = Locale.getISOCountries();

		for (String country : isoCountries) {
			System.out.println(country);
		}

		String[] languages = Locale.getISOLanguages();
		for (String lang : languages) {
			System.out.println(lang);
		}
	}

}
