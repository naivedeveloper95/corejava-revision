package immutable;

public class MyImmutable {

	int x;

	public MyImmutable(int x) {
		this.x = x;
	}

	public MyImmutable change(int x) {
		return this.x == x ? this : new MyImmutable(x);
	}

	public static void main(String[] args) {

		final MyImmutable m1 = new MyImmutable(20);
		final MyImmutable m2 = m1.change(20);

		System.out.println(m1 == m2);

		MyImmutable m3 = m2.change(30);
		System.out.println(m3 == m2);
	}

}
