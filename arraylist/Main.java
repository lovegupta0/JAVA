package com.arraylist;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee>  emp= new ArrayList<>();
		emp.add(new Employee(5,"five",new Address("street 01",45628)));
		emp.add(new Employee(6,"six",new Address("street 05",455764)));
		emp.add(new Employee(7,"seven",new Address("street 11",658745)));
		
		Comparator<Employee> firstNameSorter
        = (o1, o2) -> o1.name.compareTo(o2.name);

        //Collections.sort(emp,firstNameSorter);
		
		for(Employee emp1:emp) {
			System.out.println(emp1);
		}
		System.out.println();
		Collections.sort(emp);
		
		for(Employee emp1:emp) {
			System.out.println(emp1);
		}
		
		
		

	}

}
