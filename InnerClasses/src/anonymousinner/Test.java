package anonymousinner;

public class Test {

	public static void main(String[] args) {
		final Connection con = DriverManager.getConnection();
		con.createStatement();
	}

}
