package anonymousinner;

public class DriverManager {
	static Connection getConnection() {
		final Connection conn = () -> System.out.println("Anonymous inner classes method.");
		return conn;
	}
}
