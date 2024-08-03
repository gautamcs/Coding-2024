package com.gautam.collection.map;

import java.util.HashMap;

import com.gautam.model.Employee;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Employee, String> map = new HashMap<>();

		Employee emp1 = new Employee(101, "Gautam", "Developer");
		Employee emp2 = new Employee(101, "Gautam", "Developer");

		map.put(emp1, "IBM");
		map.put(emp2, "CTS");

		map.entrySet().stream().forEach(m -> System.out.println(m.getKey() + " -> " + m.getValue()));

		System.out.println(" Map Size: " + map.size());
		System.out.println(" emp1.equals(emp2):" + emp1.equals(emp2));

		// When hasCode() and equals() methods are overridden  in Employee class properly 
		// Whether hasCode() returns constant value or different value 
		
		/*
		 * Employee [empId=101, empName=Gautam, designation=Developer] -> CTS 
		 * Map Size: 1 
		 * emp1.equals(emp2):true
		 */

		// If hashCode() and equals() method are not overridden properly 
		
	
		/*
		 * Employee [empId=101, empName=Gautam, designation=Developer] -> IBM Employee
		 * [empId=101, empName=Gautam, designation=Developer] -> CTS Map Size: 2
		 * emp1.equals(emp2):true
		 */
	}
}
