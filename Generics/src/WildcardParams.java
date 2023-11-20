import java.util.ArrayList;

public class WildcardParams {

	public static void main(String[] args) {
		WildcardParams wcp = new WildcardParams();
		wcp.myMethod(new ArrayList<A>());
	}

	public void myMethod(ArrayList<? super B> list) {
		list.add(null);
		list.add(new B());

	}
}
