public class SingleThreaded {

	public static void main(String[] args) {
		
		SingleThreaded singleThreaded = new SingleThreaded();
		singleThreaded.printNumbers();

		for (int i = 1; i <= 200; i++) {
			System.out.print("i : " + i + "\t");
		}
	}

	void printNumbers() {
		for (int i = 1; i <= 200; i++) {
			System.out.print("i : " + i + "\t");
		}
	}

}
