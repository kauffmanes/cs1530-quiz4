/**
 * Rectangle.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Concrete class for Rectangle that uses instance of Shape
 */
import java.util.Random;

public class Rectangle implements Shape {
	
	@Override
	public void draw() {
		Random rand = new Random();
		int id = rand.nextInt(10000);       
		System.out.printf("Rectangle ID: %d\n\n", id);
	}
	
}