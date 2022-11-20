package org.college;

public class Students {
	private void getStudentInfo(int id) {
		System.out.println("Student id is " + id);
	}
	
	private void getStudentInfo(int id, char name) {
		System.out.println("Id is " + id + " name is " + name);
	}
	
	private void getStudentInfo(char email, int phoneNumber) {
		System.out.println("Email id is " + email + " phone number is " + phoneNumber);
	}

	public static void main(String[] args) {
		Students student = new Students();
		student.getStudentInfo(27);
		student.getStudentInfo(27, 'K');
		student.getStudentInfo('x', 00000);
	}

}
