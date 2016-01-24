package OverrideTest;

public class PersonDemo {

	public static void main(String[] args) {
		Person ivan = new Person("Ivan", 23);
		Person spas = new Person("Spas", 25);
		
		System.out.println(ivan.equals(spas));
		System.out.println(ivan.toString());

	}

}
