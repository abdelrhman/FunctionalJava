package main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		// List<BigDecimal> prices = Arrays.asList(new BigDecimal(10), new
		// BigDecimal(20), new BigDecimal(30),
		// new BigDecimal(40), new BigDecimal(60), new BigDecimal(50));
		// final BigDecimal totalOfPrices =
		// prices.stream().filter(price ->
		// price.compareTo(BigDecimal.valueOf(20)) > 0)
		// .map(price -> price.multiply(BigDecimal.valueOf(.9)))
		// .reduce(BigDecimal.ZERO,BigDecimal::add);
		// System.out.println(totalOfPrices);

		final List<String> names = Arrays.asList("Ali", "Karim", "Saif", "Mohammed", "Said", "Akram", "Mohsen","Nanai");
		final List<String> hunter = Arrays.asList("Gon","Kilo","Kaito","Nefri");
		final List<String> friends = Arrays.asList("Marwan","Karim","Nancy");
		// names.forEach(new Consumer<String>() {
		// @Override
		// public void accept(String name) {
		// System.out.println(name);
		// }
		// });
		// names.forEach((final String name) -> System.out.println(name));
		// names.forEach((name) -> System.out.println(name));
		// names.forEach(name -> System.out.println(name));
		// names.forEach(System.out::println);
		// names.forEach(MainClass::test);

		// names.stream()
		// .map(name -> name.toUpperCase())
		// .forEach(System.out::println);

		// names.stream()
		// .map(name -> name.length())
		// .forEach(System.out::println);

		// names.stream()
		// .map(String::toUpperCase)
		// .forEach(System.out::println);

		// names.stream()
		// .filter(name -> name.startsWith("S"))
		// .collect(Collectors.toList());

		// names.stream()
		// .filter(name -> name.startsWith("S"))
		// .forEach(System.out::println);
		
		final Predicate<String> startsWithN = name -> name.startsWith("N");
//		final Function<String, Predicate<String>> startsWithLetter = (String letter) -> {
//			Predicate<String> startsWith = name -> name.startsWith(letter);
//			return startsWith;
//		};
		final Function<String, Predicate<String>> startsWithLetter =  letter -> name -> name.startsWith(letter);
		 
		
//		names.stream()
//		.filter(checkIfStartsWithLetter("N"))
//		.map(name -> name.concat(" "))
//		.forEach(System.out::print);
//		
//		friends.stream()
//		.filter(startsWithN)
//		.map(friend -> friend.concat(" "))
//		.forEach(System.out::print);
//		
//		hunter.stream()
//		.filter(startsWithLetter.apply("K"))
//		.map(concateLetter(" "))
//		.forEach(System.out::print);
//		
//		pickName(hunter,"q");
//		pickName(hunter,"N");
//		
//		hunter.stream()
//		.mapToInt(name -> name.length())
//		.sum();
//		
//		final Optional<String> aLongName = names.stream()
//				.reduce((name1,name2) -> name1.length() >= name2.length() ? name1 : name2);
//		aLongName.ifPresent(name -> System.out.println(String.format("A long name is: %s",name)));
//		
//		System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));
		
		/*Iterating a String.*/
		final String str = "w00w"; 
		//str.chars().forEach(System.out::println); // prints the in value of char.
		//str.chars().forEach(MainClass::printChar);
//		str.chars().mapToObj(ch -> Character.valueOf((char) ch)).forEach(System.out::println);
//		str.chars().filter(ch -> Character.isDigit((char)ch)).mapToObj(ch -> Character.valueOf((char)ch)).
//		forEach(System.out::println);
		str.chars().filter(Character::isDigit)
		.forEach(MainClass::printChar);
		
		

	}
	
	private static void printChar (int ch){
		System.out.println((char)ch);
	}
	
	public static Predicate<String> checkIfStartsWithLetter(String letter){
		return name -> name.startsWith(letter);
	}
	
	public static Function<String,String> concateLetter(String letter){
		return name -> name.concat(letter);
	}
	public static void pickName (List<String> names, String startsWith){
		final Optional<String> result= names.stream()
		.filter(name -> name.startsWith(startsWith))
		.findFirst();
		System.out.println(String.format("String starts with %s : %s", startsWith,result.orElse("No name Found")));
		result.ifPresent(name -> System.out.println("Hello, "+name));
	}

	public static void test(String s) {
		System.out.println(s);
	}
}
