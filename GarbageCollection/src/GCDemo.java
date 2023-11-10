public class GCDemo {

	int objId;

	public GCDemo(int objId) {
		this.objId = objId;
		System.out.println("Created " + this.objId);
	}

	public static void main(String[] args) {

		new GCDemo(1);
		new GCDemo(2);
		new GCDemo(3);

		for (int i = 1; i <= 100; i++) {
			System.gc();
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized " + objId);
//		super.finalize();
	}
}
