package com.aa.collection.List_Short;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_Student {

	public static void main(String[] args) {

		List<Student> student = new ArrayList<Student>();

		student.add(new Student(3, "alok", 546655));
		student.add(new Student(1, "amit", 5646444));
		student.add(new Student(4, "ana", 45445646));
		student.add(new Student(2, "ram", 56445566));
	
	System.out.println("original:     "+student);
	
	Collections.sort(student);;
	
	System.out.println("After sorting: "+student);
	
	
	
	}

}
