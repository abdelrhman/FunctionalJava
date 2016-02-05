package main;

public class Person {

	private final String name;
	private final int age;

	public Person(final String name,final int age){
		this.name = name ;
		this.age = age ; 
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	public int getAgeDiffrence(final Person other){
		return age - other.getAge() ;
	}
	@Override
	public String toString() {
		return String.format("%s : %d",name, age);
	}
}
