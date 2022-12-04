package week3.assignments;

import java.util.HashSet;
import java.util.Set;

public class Task1RemoveDuplicates {

	public static void main(String[] args) {
		// step 1 declare string
		String s4 = "We learn java basics as part of java sessions in java week1";
		//Split the String into array and iterate over it
		String[] split = s4.split(" ");
		Set<String> dup = new HashSet<String>();
		for(int i=0; i < split.length; i++) {
			dup.add(split[i]);
		}
		System.out.println(dup);
		}
	}
