package localinner;

public class Outer {
	void f1() {
		System.out.println("Inside outer f1()");
		class LocalInner {
			void f2() {
				System.out.println("Inside local inner f2()");
			}
		}

		final LocalInner localInner = new LocalInner();
		localInner.f2();
	}

	public static void main(String[] args) {

		final Outer outer = new Outer();
		outer.f1();
	}
}
