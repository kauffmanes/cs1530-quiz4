/**
 * Circle.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Concrete class for Circle that uses instance of Shape
 */

public class Circle implements Shape {
	
	@Override
	public void draw() {
		Random rand = new Random();
		int id = rand.nextInt(10000);       
		System.out.printf("Circle ID: %d\n\n", id);
	}

}