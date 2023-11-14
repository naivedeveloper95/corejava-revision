public class Test {

	public static void main(String[] args) {
		
		Passenger passenge1 = new Passenger();
		passenge1.setFirstName("Satyam");
		passenge1.setLastName("Suman");
		passenge1.setId(123);
		
		
		Passenger passenge2 = new Passenger();
		passenge2.setFirstName("Satyam");
		passenge2.setLastName("Kumar");
		passenge2.setId(123);

		System.out.println(passenge1.equals(passenge2));
	}

}
