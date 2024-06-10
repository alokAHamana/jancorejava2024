package Practicle_Task;

import java.util.TreeSet;

public class EmployeeClient {

	public static void main(String[] args) {

		TreeSet<Employee> treeSet = new TreeSet<>();
		
		treeSet.add(new Employee(1,"Alok"));
		treeSet.add(new Employee(2,"Ram"));
		treeSet.add(new Employee(8,"Shyam"));
		treeSet.add(new Employee(5,"Ashish"));
		treeSet.add(new Employee(4,"Akanksha"));
		treeSet.add(new Employee(3,"Anand"));
		treeSet.add(new Employee(9,"Abhishek"));
		//treeSet.add(new Employee(6,"Alok"));
		//treeSet.add(new Employee(11,null));
		
		System.out.println(treeSet);


		
		
	}

}
