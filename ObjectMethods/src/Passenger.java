public class Passenger {

	private int id;
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Passenger Information :: First Name is " + firstName + " and Last Name is " + lastName;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		Passenger passenger = (Passenger) obj;
		return passenger.getId() == this.id && passenger.getFirstName() == this.firstName
				&& passenger.getLastName() == this.lastName;
	}

}
