package com.aa.collection.List_comparable;

import java.util.Set;
import java.util.TreeSet;

public class Sort_Student {

	public static void main(String[] args) {

		Set<Student> student = new TreeSet<Student>();

		student.add(new Student(3, "alok", 546655));
		student.add(new Student(1, "amit", 5646444));
		student.add(new Student(4, "ana", 45445646));
		student.add(new Student(2, "ram", 56445566));

		System.out.println(student);

	}

}
