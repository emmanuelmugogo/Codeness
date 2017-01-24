/**
 * final can not be changed. 
 * The static keyword denotes that a member variable,
 *  or method, can be accessed without requiring an
 *   instantiation of the class to which it belongs.
 *   Void methods dont return a value.
	
 */
public class Dog {
	
	private String name;
	private int age;
	public final static String FAMILY = "Canine"; 
	
	//constructors create objects (instances of classes)
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//'void' method don't return a value
	public void bark() {
		System.out.println("woof woof Hey Terry");
	}
	
	//this method return a String literal
	public String speak() {
		// '+' is the String concatenation operator
		return "My name is " + name + " and My Age is " + age;
	}
	
	public int equivalentHumanAge() {
		//7 is what we call a magic number. that's bad.
		//we'd usually create a constant
		return 7 * age;
	}

}
