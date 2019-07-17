/**
 * Red.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Concrete class Red that uses instance of Color
 */
import java.util.Random;

 public class Red implements Color {

	@Override
	public void fill() {
		Random rand = new Random();
		int id = rand.nextInt(10000);       
		System.out.printf("RED ID: %d\n\n", id);
	}

 }