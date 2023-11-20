
public class MethodLevelGenerics {

	public <T> void method(T e) {

	}

	public <T extends Runnable> void method2(T t) {

	}

	public <T extends Runnable & Comparable<String>> void method3(T t) {

	}
}
