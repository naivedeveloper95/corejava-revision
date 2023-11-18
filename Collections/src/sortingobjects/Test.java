package sortingobjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(100, "Obama"));
		set.add(new Employee(400, "Tom"));
		set.add(new Employee(300, "Bharath"));
		set.add(new Employee(200, "Rambo"));

		for (Employee employee : set) {
			System.out.println(employee.id + " " + employee.name);
		}

		System.out.println("\n\n");

		Set<Employee> newSet = new TreeSet<>(new EmployeeNameComparator());
		newSet.add(new Employee(100, "Obama"));
		newSet.add(new Employee(400, "Tom"));
		newSet.add(new Employee(300, "Bharath"));
		newSet.add(new Employee(200, "Rambo"));

		for (Employee employee : newSet) {
			System.out.println(employee.name + " " + employee.id);
		}

	}

}
