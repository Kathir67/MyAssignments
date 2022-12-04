package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		//implementation of List
		Set<String> mentors = new HashSet<String>(); //cant use int, should be Integer
		//Set<String> mentors = new TreeSet<String>(); //asc order
		//adding items to list
		mentors.add("Hari");
		mentors.add("Kaja");
		mentors.add("Babu");
		mentors.add("Hari");

		System.out.println(mentors); //cannot add duplicates
		System.out.println(mentors.size());
				

	}

}
