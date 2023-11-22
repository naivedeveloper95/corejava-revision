package com.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		try {
			Class<?> myClass = Class.forName(Calculator.class.getName());
			System.out.println(myClass.getName());
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));
			System.out.println(Arrays.toString(myClass.getMethods()));

			Constructor<?> constructor = myClass.getConstructor(null);
			Object myObj = constructor.newInstance(null);

			Constructor<?> constructor2 = myClass.getConstructor(double.class, double.class);
			System.out.println(constructor2.newInstance(5, 10));

			Method method3 = myClass.getMethod("setNum1", double.class);
			System.out.println(method3.invoke(myObj, 6));

			Method method4 = myClass.getMethod("setNum2", double.class);
			System.out.println(method4.invoke(myObj, 8));

			Field num1Field = myClass.getDeclaredField("num1");
			num1Field.setAccessible(true);
			num1Field.set(myObj, 80);

			Method method = myClass.getMethod("getNum1", null);
			System.out.println(method.invoke(myObj, null));

			Method method2 = myClass.getMethod("getNum2", null);
			System.out.println(method2.invoke(myObj, null));

			Method method5 = myClass.getMethod("sum", int.class, int.class);
			System.out.println(method5.invoke(myObj, 10, 20));

			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(Arrays.toString(annotations));

			MyAnnotation annotation = (MyAnnotation) annotations[0];

			System.out.println(annotation.value1());
			System.out.println(annotation.value2());

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

	}

}
