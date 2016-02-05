package main;

import java.util.Arrays;
import  java.util.Comparator;
import static java.util.Comparator.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Compare {

	public static void main(String[] args) {
		final List<Person> people = Arrays.asList(new Person("John", 20),
				new Person("Sara", 21),
				new Person("Jane", 21),
				new Person("Greg", 35));
		Comparator<Person> compareAsending = (person1,person2) -> person1.getAgeDiffrence(person2);
		Comparator<Person> compareDescending = compareAsending.reversed();
		
//		people.stream()
//		.sorted((person1, person2) -> person1.getAgeDiffrence(person2))
//		.collect(Collectors.toList()).forEach(p -> System.out.println(p.toString()));
//		
//		people.stream()
//		.sorted(Person::getAgeDiffrence)  /// magic
//		.collect(Collectors.toList()).forEach(System.out::println);
		
//		people.stream()
//		.sorted((person1, person2) -> person2.getAgeDiffrence(person1)) // changing the logic of the comparison change sorting
//		.collect(Collectors.toList()).forEach(p -> System.out.println(p.toString()));
		
//		people.stream()
//		.sorted(compareDescending)  /// using Comparator variable
//		.collect(Collectors.toList()).forEach(System.out::println);
//		
//		people.stream()
//		.sorted((person1,person2) -> person1.getName().compareTo(person2.getName()))  /// Name Sort
//		.collect(Collectors.toList()).forEach(System.out::println);
		
//		people.stream().min(Person::getAgeDiffrence).ifPresent(System.out::println); // min
//		people.stream().max(Person::getAgeDiffrence).ifPresent(System.out::println); // max
		
//		Function<Person, String> byName = person -> person.getName() ; 
//		Function<Person, Integer> byAge = person -> person.getAge() ; 
//		people.stream().sorted(comparing(byAge).thenComparing(byName).reversed()).forEach(System.out::println);; // using static import
		
		
		
	}
}
