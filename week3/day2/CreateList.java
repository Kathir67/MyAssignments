package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class CreateList {

	public static void main(String[] args) {
		//implementation of List
		List<String> mentors = new ArrayList<String>(); //cant use int, should be Integer
		//adding items to list
		mentors.add("Hari");
		mentors.add("Kaja");
		mentors.add("Babu");
		mentors.add("Hari");
		//System.out.println(mentors); [Hari, Kaja, Babu, Hari]
		//remove element
		//mentors.remove(1);
		//System.out.println(mentors); removing Kaja
		//mentors.remove(mentors)
		//retrieve the item
		String mentor = mentors.get(2);
		System.out.println(mentor);
		//to check it has the required
		boolean contains = mentors.contains("Kaja");
		System.out.println(contains);
		//clear all the elements
		mentors.clear();
		System.out.println(mentors);
		//to check if it is empty
		boolean empty = mentors.isEmpty();
		System.out.println(empty);

	}

}
