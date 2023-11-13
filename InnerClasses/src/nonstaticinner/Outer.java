package nonstaticinner;

public class Outer {

	private static final int x = 50;
	private int y;

	public Outer(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("Outer classes non-static methods");
	}

	class Inner {

		private final int y;

		public Inner(int y) {
			this.y = y;
		}

		void f2() {
			System.out.println("Outer classes x " + Outer.x);
			System.out.println("Outer classes y " + Outer.this.y);
			System.out.println("Inner classes y " + this.y);
		}
	}

	public static void main(String[] args) {
		final Outer outer = new Outer(80);
		outer.f1();

		final Outer.Inner inner = outer.new Inner(30);
		inner.f2();
		System.out.println(inner.y);
	}
}
