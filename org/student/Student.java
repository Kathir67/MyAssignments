package org.student;

import org.college.College;
import org.department.Department;

public class Student extends College {
	private void studentName() {
		System.out.println("My name is Kathiravan");

	}
	private void studentId() {
		System.out.println("My student id is 03ABP1927");
	}
	private void studentDepartment() {
		System.out.println("Student department is Physics");

	}

	public static void main(String[] args) {
		// creating object
		Student student = new Student();
		student.studentId();
		student.studentName();
		student.studentDepartment();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.departmentName();	
	}

}
