/**
 * Square.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Concrete class for Square that uses instance of Shape
 */
import java.util.Random;

public class Square implements Shape {

	@Override
	public void draw() {
		Random rand = new Random();
		int id = rand.nextInt(10000);       
		System.out.printf("Square ID: %d\n\n", id);
	}

}