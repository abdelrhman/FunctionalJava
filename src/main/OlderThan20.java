package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author abdelrhman
 * **/
public class OlderThan20 {
	
	public static void main(String[] args) {
		final List<Person> people = Arrays.asList(new Person("John", 20),
				new Person("Sara", 21),
				new Person("Nada", 19),
				new Person("Ali", 18),
				new Person("Jane", 21),
				new Person("Greg", 35));
		// collect people that are older than 20 
//		List<Person> olderThan20 = new ArrayList<>();
//		people.stream()
//		.filter(person -> person.getAge() > 20)
//		.forEach(person -> olderThan20.add(person));
		
//		List<Person> olderThan20  = 
//				people.stream()
//				.filter(person -> person.getAge() > 20)
//				.collect(ArrayList::new, ArrayList::add,ArrayList::addAll);
		
		
		List<Person> olderThan20  = 
				people.stream()
				.filter(person -> person.getAge() > 20)
				.collect(Collectors.toList());

		System.out.println(olderThan20.size() + " People");
		
		
		
	}

}
