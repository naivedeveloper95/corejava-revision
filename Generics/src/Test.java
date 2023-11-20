public class Test {

	public static void main(String[] args) {

		MyGenericClass<String> str1 = new MyGenericClass<String>("Satyam");
		str1.displayObjectDetails();
		str1.getObject();

		MyGenericClass<Integer> st2 = new MyGenericClass<>(123);
		st2.displayObjectDetails();
		st2.getObject();

		MyGenericClass<Double> st3 = new MyGenericClass<>(23.45);
		st3.displayObjectDetails();
		st3.getObject();
	}

}
