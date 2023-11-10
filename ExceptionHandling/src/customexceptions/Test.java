package customexceptions;

public class Test {

	public static void main(String[] args) throws UncheckedCustomException {

		throw new UncheckedCustomException("Business Exception occurred!");
		
//		throw new CheckedCustomException("Business Exception occurred!");

	}

}
